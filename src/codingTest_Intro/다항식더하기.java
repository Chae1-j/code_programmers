package codingTest_Intro;

import java.util.Arrays;
//import java.util.Scanner;

public class 다항식더하기 {

	public static void main(String[] args) {
		/*
		 * 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 다항식을 계산할 때는 동류항끼리 
		 * 계산해 정리합니다. 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 
		 * 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 같은 식이라면 가장 짧은 수식을 
		 * return 합니다.
		 */
//		Scanner sc = new Scanner(System.in);
		String polynomial = "30 + 10";
		String answer = "";
		int xnum = 0;
		int num = 0;
		String[] p_str = polynomial.split(" ");
		for(int i = 0; i < p_str.length; i++) {
			int len = p_str[i].length();
			if(len > 1 && p_str[i].contains("x") ) {
				xnum += Integer.valueOf(p_str[i].substring(len-2,len-1));
			} else if(p_str[i].equals("x")) {
				xnum++;
			} else if(!p_str[i].contains("x") && !p_str[i].equals("+")) {
				num += Integer.valueOf(p_str[i]);
			}
		}
		
		if(num!=0) {
			answer= String.valueOf(xnum)+ "x" + " + "+ String.valueOf(num);
		} else if(xnum==0) {
			answer = String.valueOf(num);
		} else if(num==0) {
			answer = String.valueOf(xnum)+"x";
		} else if(num==0 && xnum==0) {
			 answer = "0";
		}
		System.out.println(answer);
	}

}
