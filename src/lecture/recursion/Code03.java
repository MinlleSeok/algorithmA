package algorithm;

public class Code03 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);
		result = factorial(4);
		System.out.println(result);
		result = (int)power(2.0, 3);
		System.out.println(result);
	}
	
	// 1 ~ n 까지의 합을 구한다.
	public static int func(int n) {
		if (n <= 0)
			return 0;
		else {
			return n + func(n-1);
		}
	}
	
	public static int factorial(int n) {
		if (n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static double power(double x, int n) {
		if (n==0)
			return 1;
		else
			return x*power(x, n-1);
	}
}
