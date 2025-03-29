package probA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Prb_C {

	public static int triangularNumber(int n) {
		int s= 0;
		for(int i=1 ; i<=n ;i++) {
			s+=i;
		}
		return s;
	}
	
	public static int weighted(int n) {
		int s= 0;
		for(int i=1 ; i<=n ;i++) {
			s += i * triangularNumber(i+1) ;
		}
		
		return s;
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("good.in.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("good.out.txt"));
		
		int N = Integer.parseInt(in.readLine());
		
		for(int i = 1 ; i<=N ;i++) {
			int n = Integer.parseInt(in.readLine());
			out.println(i +" "+ n +" "+weighted(n) );
			System.out.println(i +" "+ n +" "+weighted(n) );
		}
		
		in.close();
		out.close();
	}
}
