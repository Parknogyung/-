package _5장_연습문제.com.q3.source;

public class Calculator {
	int value;
	
	public Calculator(){
		this.value = 0;
	}
	
	public void add(int val) {
		this.value += val;
	}
	
	public boolean isOdd() {
		if(this.value%2 == 0) return false;
	
		return true;
	}
	
	public int getValue() {
		return this.value;
	}
	
}
