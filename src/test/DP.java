package test;

public class DP {

	static int[] memo = new int[100];
	
	public static int fibonacci(int n) {
		
		if(n <= 1)
			return n;
		
		else if (n == 2)
			return 1;
		
		else {
			if (memo[n] > 0)
				return memo[n];
			
			memo[n] = fibonacci(n-1) + fibonacci(n-2);
			return memo[n];
		}
	}
	
	static int[] d = new int[100];
	public static int fibonacci2(int n) {
		d[0] = 0;
		d[1] = 1;
		for (int i = 2; i <= n; i++) {
			d[i] = d[i - 1] + d[i - 2];
		}
		return d[n];
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(10));
		System.out.println(fibonacci2(10));
	}
}
