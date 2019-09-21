package recursive;
// 재귀 함수 이해하기

import java.util.Scanner;

import stack.IntStack;

class RecurX2 {
	
	// 재귀 함수
	// 꼬리 재귀를 제거했습니다.
	static void recur(int n) {
		IntStack s = new IntStack(n);
		
		while (true) {
			if (n > 0) {
				s.push(n);	// n의 값을 푸시
				n = n - 1;
				continue;
			}
			if (s.isEmpty() != true) {	// 스택이 비어 있지 않다면
				n = s.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = stdIn.nextInt();
		
		recur(x);
	}
}
