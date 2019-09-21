package basic.java;
import java.util.Scanner;
// 곱셈표를 출력합니다.

public class Multi99Table
{
	public static void main(String[] args) {
		System.out.println("---------------------------- 곱셈표 ----------------------------");
		
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++)
                System.out.printf("%d*%d=%2d ", i, j, i * j);
            System.out.println();
        }
	}
}
