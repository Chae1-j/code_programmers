package codingTest_lv1;

import java.util.Scanner;

public class 다트게임 {

	public static void main(String[] args) {
		/*
		 * 카카오톡 게임별의 하반기 신규 서비스로 다트 게임을 출시하기로 했다. 다트 게임은 다트판에 다트를 세 차례 던져 그 점수의 
		 * 합계로 실력을 겨루는 게임으로, 모두가 간단히 즐길 수 있다. 갓 입사한 무지는 코딩 실력을 인정받아 게임의 핵심 부분인 
		 * 점수 계산 로직을 맡게 되었다. 다트 게임의 점수 계산 로직은 아래와 같다.
		 * 	1. 다트 게임은 총 3번의 기회로 구성된다.
		 * 	2. 각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
		 * 	3. 점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 
		 *	   3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
		 * 	4. 옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 
		 * 	   아차상(#) 당첨 시 해당 점수는 마이너스된다.
		 * 	5. 스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
		 * 	6. 스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. 
		 * 	   (예제 4번 참고)
		 * 	7. 스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. 
		 * 	   (예제 5번 참고)
		 * 	8. Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
		 * 	9. 스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
		 * 0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.
		 */
		String dartResult = new Scanner(System.in).next();
		int answer = 0;
		String[] dart = dartResult.split("");
        int[] score = new int[3]; // 점수

        int index = -1; // score index
        for(int i=0; i<dart.length; i++) {
            // 숫자인지 확인
            if(dart[i].matches("[0-9]")) {
                index++;
                score[index] = Integer.parseInt(dart[i]);
                // 두자리 수 숫자?
                if(dart[i+1].matches("[0-9]")) {
                    score[index] *= 10;
                    i++;
                }
            }
            
            switch(dart[i]) {
                case "D":
                    score[index] = (int)Math.pow(score[index], 2);
                    break;
                case "T" :
                    score[index] = (int)Math.pow(score[index], 3);
                    break;
                case "*" :
                    score[index] *= 2;
                    if(index - 1 >= 0) score[index-1] *= 2;
                    break;
                case "#" :
                    score[index] *= -1;
            }
            
        }
        
        for(int s : score) {
            answer += s;
        }


		System.out.println(answer);
	}

}
