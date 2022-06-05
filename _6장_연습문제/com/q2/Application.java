package _6장_연습문제.com.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = "";
		
		while(!st.equals("END")) {
			st = br.readLine().toUpperCase();
			System.out.println(st);
		}
		
	}

}
