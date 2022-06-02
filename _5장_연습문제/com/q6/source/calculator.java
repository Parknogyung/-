package _5장_연습문제.com.q6.source;

public class calculator {
	Integer value;
	
	public calculator() {
		this.value = 0;
	}
	
	public void add(int val) {
		this.value = val;
	}
	
	public Integer getValue() {
		return this.value;
	}
}
