package codingTest_Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 문자열정렬하기1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<>();
		// 문자열 개별로 저장하기 위한 문자열 배열 생성
		String[] strArr = my_string.split("");
		// 반복문으로 index마다 접근
		for(int i = 0; i < strArr.length; i++) {
			if(NumChk(strArr[i])) {
				list.add(Integer.parseInt(strArr[i]));
			}
		}
		answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
	}
	public static boolean NumChk(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}

}

/* 처음 생각했던 코
	int[] answer = {};
	ArrayList<Character> list = new ArrayList<>();
	for(int i = 0; i < my_string.length(); i++) {
	    
	    char ch = my_string.charAt(i);
	    System.out.println(ch);
	    if(!(ch+0>=97) && !(ch+0 <= 122)) {
	        list.add(my_string.charAt(i));
	    }
	}
	System.out.println(list);
  
 */
