package _5장_연습문제.com.q4;

import java.util.ArrayList;
import java.util.Arrays;

import _5장_연습문제.com.q4.source.Calculator;

public class main {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int[] data = {1, 3, 5, 7, 9};
		int result = c.avg(data);
		System.out.println(result);
		
		ArrayList<Integer> data1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
		int result1 = c.avg(data1);
		System.out.println(result1); 
	}

}
