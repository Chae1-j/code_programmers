package codingTest_LV1;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열내림차순으로배열 {
	
	public static void main(String[] args) {
		/*
		 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 
		 * 완성해주세요. s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
		 */
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String answer = "";
		String[] arr = s.split("");
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--) {
        	answer += arr[i];
        }
        
		System.out.println(answer);
	}

}
