package probA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Prb_B {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("bin.in.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("bin.out.txt"));

		int n = Integer.parseInt(in.readLine());

		for (int i = 0; i < n; i++) {
			String[] N = in.readLine().split(" ");
			String P1 = N[0];
			String P2 = N[1];

			System.out.println((i + 1) + " " + Add(P1, P2));
			out.println((i + 1) + " " + Add(P1, P2));
		}

		in.close();
		out.close();
	}

	public static String Add(String a, String b) {

		int i = a.length() - 1;
		int j = b.length() - 1;
		StringBuilder res = new StringBuilder();
		int carry = 0;
		int sum = 0;

		while (i >= 0 || j >= 0 || carry == 1) {
			int p1 = 0, p2 = 0;
			if (i >= 0)
				p1 = Integer.parseInt(String.valueOf(a.charAt(i)));
			if (j >= 0)
				p2 = Integer.parseInt(String.valueOf(b.charAt(j)));
			sum = p1 + p2 + carry;
			res.append(sum%2);
			carry = sum / 2;
			i--;
			j--;
		}
		return res.reverse().toString();
	}
}
