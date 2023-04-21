package codingTest_Basic;

import java.util.*;

public class 이차원배열대각선순회하기 {

	public static void main(String[] args) {
		/*
		 * 2차원 정수 배열 board와 정수 k가 주어집니다. i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 
		 * 합을 return 하는 solution 함수를 완성해 주세요.
		 */
		int[][] board = {{},{},{}};
		int k = 0;
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < board.length; i++) {
	        for(int j = 0; j < board[i].length; j++) {
	            if(i+j <= k) {
	                list.add(board[i][j]);
	            }
	        }
	    }
	    for(int i = 0; i < list.size(); i++) {
	        answer += list.get(i);
	    }
	    System.out.println(answer);
	}

}
