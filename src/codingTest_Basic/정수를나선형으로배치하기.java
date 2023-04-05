package codingTest_Basic;

import java.util.Arrays;
import java.util.Scanner;

public class 정수를나선형으로배치하기 {

	public static void main(String[] args) {
		/*
		 * 양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 
		 * 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] answer = new int[n][n];
		int num = 1; 
        int rowStart = 0;
        int rowEnd = n - 1; 
        int colStart = 0;
        int colEnd = n - 1;

        while (num <= n * n) {
            for (int col = colStart; col <= colEnd; col++) {
                answer[rowStart][col] = num++;
            }
            rowStart++;

            for (int row = rowStart; row <= rowEnd; row++) {
                answer[row][colEnd] = num++;
            }
            colEnd--;

            for (int col = colEnd; col >= colStart; col--) {
                answer[rowEnd][col] = num++;
            }
            rowEnd--;

            for (int row = rowEnd; row >= rowStart; row--) {
                answer[row][colStart] = num++;
            }
            colStart++;
        }
		System.out.println(Arrays.deepToString(answer));
	}
}
