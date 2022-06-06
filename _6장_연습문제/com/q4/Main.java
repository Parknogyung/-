package _6장_연습문제.com.q4;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sample.txt", true);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		fw.write(br.readLine()+"");
		fw.flush();
		fw.close();
		
	}

}
