package codingTest_lv0;

import java.util.Arrays;

public class 옹알이_1 {

	public static void main(String[] args) {
		/*
		 * 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 
		 * 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다. 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 
		 * 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
		 * 
		 * - 1 ≤ babbling의 길이 ≤ 100
		 * - 1 ≤ babbling[i]의 길이 ≤ 15
		 * - babbling의 각 문자열에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
		 * 	 즉, 각 문자열의 가능한 모든 부분 문자열 중에서 "aya", "ye", "woo", "ma"가 한 번씩만 등장합니다.
		 * - 문자열은 알파벳 소문자로만 이루어져 있습니다.
		 */
		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		int answer = 0;
		String[] words = {"aya","ye","woo","ma"};
		for(int i = 0; i < babbling.length; i++) {
			for(int j = 0; j < words.length; j++) {
				if(babbling[i].contains(words[j])) {
					babbling[i]=babbling[i].replace(words[j], "@");
					// words 의 발음들을 @(임의의 문자)로 치환
				} 
			}
			System.out.println(Arrays.toString(babbling));
			babbling[i] = babbling[i].replace("@", "");
			// 치환한 문자를 공백으로 다시 치환 > 발음가능한 문자들만 모인 단어들인지 판단하기 위한 처리작업
			if(babbling[i].equals("")) answer++; // 공백만 있는 경우에 단어의 갯수 증가처리
		}
		
		System.out.println(Arrays.toString(babbling));
		System.out.println(answer);

  	}

}

/*
 * 
 *		리스트와 배열을 이용한 방법(다른사람 풀이참조)
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        // 문자열 배열을 담을 리스트 생성
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < babbling.length; i++) {
            // 문자열 split으로 자른다. 만약 이 안에 있는 원소로만 잘린다면 빈칸이 됨
            String[] temp = babbling[i].split("aya|ye|woo|ma");
            // 문자열 배열을 리스트에 넣는다.
            list.add(temp);
        }
        // 리스트 안의 문자열 배열의 빈칸의 갯수를 셈 (빈칸 == 모든 문자가 다 사라짐을 의미)
        for (int i = 0; i < list.size(); i++) if (list.get(i).length == 0) count++;
        return count;
    }
}
 */
