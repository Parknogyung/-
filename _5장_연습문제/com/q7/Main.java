package _5장_연습문제.com.q7;

interface minera{
	int getValue();
}

class Gold implements minera{
	public int getValue() {
	return 100;
	}
}

class Silver implements minera{
	public int getValue() {
		return 90;
	}
}

class Bronze implements minera{
	public int getValue() {
		return 80;
	}
}

class MineralCalculator {
    int value = 0;

    public void add(minera mineral) {
        this.value += mineral.getValue();
    }

    public int getValue() {
        return this.value;
    }
}


public class Main {

	public static void main(String[] args) {
		MineralCalculator cal = new MineralCalculator();
		cal.add(new Gold());
		cal.add(new Silver());
		cal.add(new Bronze());
		System.out.println(cal.getValue());
	}

}
