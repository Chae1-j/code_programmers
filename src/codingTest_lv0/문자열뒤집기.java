package codingTest_lv0;

import java.util.Scanner;

public class 문자열뒤집기 {

	public static void main(String[] args) {
		/*
		 * 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 
		 * 완성해주세요.
		 */
		String my_string = (new Scanner(System.in)).next();
		String answer = "";
        String[] myArr = new String[my_string.split("").length];
        String[] reArr = new String[myArr.length];
        myArr = my_string.split("");
        for(int i = 0, j = myArr.length-1; j >= 0; i++, j--) {
            reArr[i] = myArr[j];
            answer += reArr[i];
        }
        System.out.println(answer);

	}

}
