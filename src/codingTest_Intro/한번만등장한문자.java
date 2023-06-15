package codingTest_Intro;

import java.util.Arrays;
import java.util.Scanner;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String answer = "";
		int cnt = 0;
		String[] sArr = s.split("");
		Arrays.sort(sArr);
		for(int i = 0; i < sArr.length; i++) {
			cnt = 0;
			for(int j = 0; j < sArr.length; j++) {
				if(sArr[i].equals(sArr[j])) {
					cnt++;
				}
			}
			if(cnt == 1) answer+= sArr[i];
		}
		System.out.println(Arrays.toString(sArr));
		System.out.println(answer);
	}

}
