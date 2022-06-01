package _5장_연습문제.com.q1;

import _5장_연습문제.com.q1.source.q1;

public class main {

	public static void main(String[] args) {
		q1 q = new q1();
		
		q.add(10);
		q.minus(5);
		System.out.println(q.getValue());
	}
}
