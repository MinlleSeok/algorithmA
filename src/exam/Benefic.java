package exam;

import java.util.Scanner;

public class Benefic {
	static int MAX_INVEST_MONEY = 301;
	static int MAX_STARTUP = 21;
	
	static int[][] investmentTable = new int[MAX_INVEST_MONEY][MAX_STARTUP];
	static int[] Solutions = new int[MAX_INVEST_MONEY];
	
	static int getMaxBenefit(int p, int q) {
		if (p > q)
			return p;
		else
			return q;
	}
	
	public static void main(String[] args) {
		int tc, testCases;
		int totalMoney = 0, num_Startup = 0;
		int maxBenefit;
		
		// 총 테스트 수를 입력받는다
		Scanner sc = new Scanner(System.in);
		
		testCases = sc.nextInt();
		
		for (tc = 0; tc < testCases; tc++) {
			int i, j, k;
			
			// 전체 투자 금액과 투자할 스타트업의 수를 입력받는다
			totalMoney = sc.nextInt();
			num_Startup = sc.nextInt();
			
			// 투자 테이블 입력받기
			for (i = 0; i < totalMoney; i++)
				for (j = 0; j <= num_Startup; j++)
					investmentTable[i][j] = sc.nextInt();
			
			for (i = 0; i < num_Startup; i++)
				for (j = totalMoney - 1; j >= 0; j--) {
					maxBenefit = -1;
					
				for (k = 0; k < totalMoney; k++) {
					if (j - k >= 0) {
						System.out.printf("maxBenefit : %d, Solutions[%d] : %d, total : %d\n",
								maxBenefit, (j - k), Solutions[j - k], (Solutions[j - k] + 
										investmentTable[k][i + 1]));
						maxBenefit = getMaxBenefit(maxBenefit, (Solutions[j - k] +
								investmentTable[k][i + 1]));
					}
					
					Solutions[j] = getMaxBenefit(Solutions[j], maxBenefit);
					System.out.printf("Solutions : %d, %d, %d, %d\n", Solutions[0], Solutions[1],
							Solutions[2], Solutions[3]);
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.printf("최대 투자 이익금 : %d %d\n\n", Solutions[totalMoney], totalMoney);
	}
}
