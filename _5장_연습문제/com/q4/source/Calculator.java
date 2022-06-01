package _5장_연습문제.com.q4.source;

import java.util.ArrayList;
import java.util.Iterator;

public class Calculator {
	int value;
	
	public Calculator() {
		this.value = 0;
	}
	
	public void add(int val) {
		this.value+=val;
	}
	
	public int avg(int[] data) {
		int avg = 0;
		int sum = 0;
		
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		avg = sum/data.length;
		
		return avg;
	}
	
	public int avg(ArrayList<Integer> list) {
		int sum = 0;
		int avg = 0;
		
		for (int i = 0; i < list.size(); i++) {
			sum+=list.get(i);
		}
		avg = sum/list.size();
		return avg;
	}
	
	public int getValue() {
		return value;
	}
	
	
	
}
