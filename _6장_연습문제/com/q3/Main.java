package _6장_연습문제.com.q3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sample.txt");
		fw.write("Write once, run anywhere");
		fw.flush();
		fw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		
		System.out.println(br.readLine());
	}

}
