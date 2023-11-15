package codingTest_lv1;

import java.util.Arrays;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		/*
		 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다. 
		 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
		 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
		 */
		String[] participant = {"kiki", "kiki", "kiki",};
		String[] completion = {"kiki", "kiki"};
		String answer = "";
		int cnt = 0;
		Arrays.sort(participant);
		Arrays.sort(completion);
//		System.out.println(Arrays.toString(participant));
//		System.out.println(Arrays.toString(completion));
		Arrays.sort(participant);
		Arrays.sort(completion);
		if(completion.length == 0) {
            answer = participant[0];
		} else {
            for(int i = 0; i < completion.length; i++) {
				if(!participant[i].equals(completion[i])) {
					answer = participant[i];
					break;
				} else {
					cnt++;
				}
				if(cnt == completion.length) answer = participant[i+1];
			}
        }
		System.out.println(answer);
	}

}
