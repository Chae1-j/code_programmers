package codingTest_LV1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class 숫자문자열과영단어 {

	public static void main(String[] args) {
		/*
		 * 네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 
		 * 숫자를 찾는 게임입니다.
		 * 다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
		 * - 1478 → "one4seveneight"
		 * - 234567 → "23four5six7"
		 * - 10203 → "1zerotwozero3"
		 * 이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 
		 * return 하도록 solution 함수를 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("one", "1");
		hash.put("two", "2");
		hash.put("three", "3");
		hash.put("four", "4");
		hash.put("five", "5");
		hash.put("six", "6");
		hash.put("seven", "7");
		hash.put("eight", "8");
		hash.put("nine", "9");
		hash.put("zero", "0");
		for(int i = 0; i < hash.size(); i++) { 
			
		}

	}

}
