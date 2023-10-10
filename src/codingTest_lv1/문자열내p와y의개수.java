package codingTest_lv1;

import java.util.Scanner;

public class 문자열내p와y의개수 {

	public static void main(String[] args) {
		/*
		 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 
		 * 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
		 *  단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.예를 들어 s가 "pPoooyY"면 true를 return하고 
		 *  "Pyy"라면 false를 return합니다.
		 */
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean answer = true;
        s = s.toLowerCase(); // 대소문자 구별하지 않으므로, 전체 소문자 변환(대문자 변환도 가능)
        int p = 0;
        int y = 0;
        for(int i = 0; i < s.length();i++) {
            if(s.charAt(i)=='p') {
                p++;
            } else if(s.charAt(i)=='y') {
                y++;
            }
        }
        if(p!=y) answer = false;
	}	

}
