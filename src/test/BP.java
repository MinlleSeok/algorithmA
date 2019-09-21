package test;

public class BP {

	public static void nextPermutation(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			// 끝에서 부터 A[i-1] < A[i]를 만족하는 가장 큰 i 탐색
			if (arr[i - 1] < arr[i]) {
				// i를 찾았으면  j >= i이면서 A[j] > A[i - 1]를 만족하는 가장 큰 j를 찾는다.
				for (int j = arr.length - 1; j >= i; j--) {
					if (arr[j] > arr[i - 1]) {
						// A[i]와 A[j]를 swap
						// A[i]부터 순열을 뒤집는다.
					}
				}
			}
		}
	}
	
	public static void previousPermutation(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			// 끝에서부터 A[i-1] > A[i]를 만족하는 가장 큰 i를 탐색
			if (arr[i - 1] > arr[i]) {
				// i를 찾았으면 j >= i이면서 A[j] < A[i-1]를 만족하는 가장 큰 j를 찾는다.
				for (int j = arr.length - 1; j >= i; j--) {
					if (arr[j] < arr[i - 1]) {
						// A[i]와 A[j]를 swap
						// A[j]부터 순열을 뒤집는다.
					}
				}
			}
		}
	}
}
