package _6장_연습문제.com.q5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("sample.txt");
		ArrayList<String> arr = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

		while(true) {
			String st = br.readLine();
			System.out.println(st);
			if(st==null) break;
			st = st.replaceAll("python", "java");
			arr.add(st);
		}
		
		FileWriter fw = new FileWriter("sample.txt");
		fw.write(arr.get(0) + "\n");
		fw.write(arr.get(1));
		
		br.close();
		fw.flush();
		fw.close();
	
		
	}

}
