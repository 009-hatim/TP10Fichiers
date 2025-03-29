package problem;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Prb_A {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("in.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("out.txt"));

		int n = Integer.parseInt(in.readLine());
		String[] numbres = in.readLine().split(" ");
		
		Set<Integer> set = new HashSet<>();
		int count = 0;
		for (String num : numbres) {
			int x = Integer.parseInt(num);
			set.add(x);
		}
		for (int num : set) {
			if (num > 0 && set.contains(-num)) {
				count++;
			}
		}
		out.println(count);
		System.out.println(count);
		out.close();
		in.close();

	}
}
