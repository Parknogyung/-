package _5장_연습문제.com.q2.source;

public class MaxLimitCalculator extends Calculator {
	public MaxLimitCalculator() {
	}
	
	@Override
	public int getVal() {
		if(super.val > 100){
		return 100;
	}
		return super.getVal();
	}
}
