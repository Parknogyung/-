package _7장_연습문제.com.q2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
// 제일 먼저 ArrayIndexOutofBoundsException이 발생하여 나머지 예외는 발생되지 않고 final만 실행되어 7 출력됨
    public static void main(String[] args) {
        int result = 0;
        try {
            int[] a = {1, 2, 3};
            int b = a[3];  // ArrayIndexOutOfBoundsException 발생
            ArrayList c = new ArrayList(Arrays.asList("3"));
            int d = (int) c.get(0);  // ClassCastException 발생
            int e = 4 / 0;  // ArithmeticException 발생
        } catch (ClassCastException e) {
            result += 1;
        } catch (ArithmeticException e) {
            result += 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            result += 3;
        } finally {  // 예외에 상관없이 항상 수행된다.
            result += 4;
        }
        System.out.println(result); // 7 출력
    }
}