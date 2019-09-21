package test;

public class Prime {

	static boolean prime(int n) {
		if (n < 2) 
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(prime(13));
	}
}
