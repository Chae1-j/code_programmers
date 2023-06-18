package codingTest_Intro;

import java.util.Arrays;

public class OX퀴즈 {

	public static void main(String[] args) {
		/*
		 * 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 
		 * 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
		 */
		String[] quiz = {};
		String[] answer = new String[quiz.length];
		for (int i = 0; i < quiz.length; i++) {
            String[] sArr = quiz[i].split(" ");
            int num1 = Integer.parseInt(sArr[0]);
            String str = sArr[1];
            int num2 = Integer.parseInt(sArr[2]);
            int result = Integer.parseInt(sArr[4]);
            
            int cal = str.equals("+") ? num1 + num2 : num1 - num2;
            answer[i] = cal == result ? "O" : "X";
        }
		
		System.out.println(Arrays.toString(answer));
	}

}
