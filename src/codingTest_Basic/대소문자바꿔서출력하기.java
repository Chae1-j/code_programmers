package codingTest_Basic;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {

	public static void main(String[] args) {
		/*
		 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 
		 * 출력하는 코드를 작성해 보세요.
		 */
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr;
        String answer = "";
        arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 97 && arr[i] <= 122) {
                arr[i] = (char)(arr[i]-32);
            } else {
                arr[i] = (char)(arr[i]+32);
            }
            answer += arr[i];
        }
        System.out.println(answer);
		
	}

}
