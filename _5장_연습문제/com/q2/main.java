package _5장_연습문제.com.q2;

import _5장_연습문제.com.q2.source.Calculator;
import _5장_연습문제.com.q2.source.MaxLimitCalculator;

public class main {

	public static void main(String[] args) {
		Calculator cal = new MaxLimitCalculator();
		cal.add(200);
		System.out.println(cal.getVal());
	}

}
