package codingTest_lv0;

import java.util.Scanner;

public class 컨트롤제트 {

	public static void main(String[] args) {
		/*숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다. 
		 * 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 
		 * 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
		 */
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int answer = 0;
        String[] strArr = s.split(" ");
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].equals("Z")) { // z가 아닐 때 숫자 값 더하기(if 문 쓰지 않으면 z값이 숫자로 변환되지 않으므로 오류발
                answer += Integer.parseInt(strArr[i]);
            }
            System.out.println(answer);
            if(strArr[i].equals("Z")) {
                answer -= Integer.parseInt(strArr[i-1]);
            }
        }
        System.out.println(answer);

	}

}
