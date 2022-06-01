package _5장_연습문제.com.q1.source;

public class q1 {
	int value;
	
	public q1() {
		this.value = 0;
	}
	
	public void add(int val) {
		this.value += val;
	}

	public void minus(int val) {
		this.value -= val;
	}
	
	public int getValue() {
		return this.value;
	}
}
