package codingTest_Intro;

import java.util.*;

public class 이차원만들기 {
	/*
	 * 정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를 다음 설명과 같이 2차원 배열로 바꿔 
	 * return하도록 solution 함수를 완성해주세요.
	 * num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 
	 * 변경합니다. 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num_list = {1,2,3,4,5,6,7,8};
		int[][] answer = new int[num_list.length/n][n]; 
//		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int idx = 0;
        
        for (int i = 0; i < num_list.length; i += n) {
            for (int j = 0; j < n; j++) {
                answer[idx][j] = num_list[i + j];
            }
            idx++;
        }
		System.out.println(Arrays.deepToString(answer));
	}

}
/*

/*
첫 코드
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        for(int k = 0; k < num_list.length; k++) {
            for(int i = 0; i < answer.length; i++) {
                for(int j = 0; j < answer[i].length; j++) {
                    answer[i][j] = num_list[k];
                    break;
                }
                break;
            }
        }
        return answer;
    }
}

다른 사람의 코드
		int[][] answer = {};

        int length = num_list.length;

        answer = new int[length/n][n];

        for(int i=0; i<length; i++){
            answer[i/n][i%n]=num_list[i];
        }

        return answer;

*/