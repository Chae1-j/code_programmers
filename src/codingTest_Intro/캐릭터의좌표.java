package codingTest_Intro;

import java.util.Arrays;

public class 캐릭터의좌표 {

	public static void main(String[] args) {
		/*
		 * 머쓱이는 RPG게임을 하고 있습니다. 게임에는 up, down, left, right 방향키가 있으며 각 키를 누르면 
		 * 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다. 예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 
		 * [0, 1], down을 누른다면 [0, -1], left를 누른다면 [-1, 0], right를 누른다면 [1, 0]입니다. 머쓱이가 
		 * 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다. 캐릭터는 항상 [0,0]에서 
		 * 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해주세요.
		 * 
		 */
		String[] keyinput = {"left", "left", "left", "left", "right", "right", "right", "right"};
		int[] board = {5,5};
		int[] answer = new int[2];
		int x = board[0]/2;
		int y = board[1]/2;
//		System.out.println("x? " + x);
		for(int i = 0; i < keyinput.length; i++) {
			if(keyinput[i].equals("left") && Math.abs(answer[0]) < x) {
				answer[0] -= 1;
			} else if(keyinput[i].equals("right") && Math.abs(answer[0]) < x) {
				answer[0] += 1;	
			} else if(keyinput[i].equals("down") && Math.abs(answer[1]) < y) {
				answer[1] -= 1;
			} else if(keyinput[i].equals("up") && Math.abs(answer[1]) < y) {
				answer[1] += 1;
			}
		}
		// 0625 프로그래머스 1,3,8,9 번 실패
		System.out.println(Arrays.toString(answer));
	}

}
