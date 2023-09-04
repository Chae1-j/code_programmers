package codingTest_LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 문자열내마음대로정하기 {

	public static void main(String[] args) {
		/*
		 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 
		 * 오름차순 정렬하려 합니다. 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 
		 * 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strings = {"sun", "bed", "car"};
		String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);
        answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        System.out.println(Arrays.toString(answer));
	}

}
