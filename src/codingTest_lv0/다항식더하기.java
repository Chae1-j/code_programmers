package codingTest_lv0;

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
		String polynomial = "30x + 10";
//		String answer = "";
//		int xnum = 0;
//		int num = 0;
//		String[] p_arr = polynomial.split(" ");
//		for(int i = 0; i < p_arr.length; i++) {
//			int len = p_arr[i].length();
//			if(len > 1 && p_arr[i].contains("x") ) {
//				xnum += Integer.valueOf(.substring(len-2,len-1));
//			} else if(p_arr[i].equals("x")) {
//				xnum++;
//			} else if(!p_arr[i].contains("x") && !p_arr[i].equals("+")) {
//				num += Integer.valueOf(p_arr[i]);
//			}
//		}
//		
//		if(num!=0) {
//			answer= String.valueOf(xnum)+ "x" + " + "+ String.valueOf(num);
//		} else if(xnum==0) {
//			answer = String.valueOf(num);
//		} else if(num==0) {
//			answer = String.valueOf(xnum)+"x";
//		} else if(num==0 && xnum==0) {
//			 answer = "0";
//		}
        String answer = "";
        String[] arr = polynomial.split(" +");
        int strNum = 0;
        int num = 0;

        for (String s : arr) {
            if (s.equals("x")) {
                strNum += 1;
            } else if (s.contains("x")) {
                strNum += Integer.parseInt(s.substring(0, s.length() - 1));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }

        if (strNum != 0 && num == 0) {
            if (strNum == 1) {
                answer = "x";
            } else {
                answer = strNum + "x";
            }
        } 

        if (strNum != 0 && num != 0) {
            if (strNum == 1) {
                answer = "x" + " + " + num;
            } else {
                answer = strNum + "x" + " + " + num;
            }
        }

        if (strNum == 0 && num != 0) {
            answer = String.valueOf(num);
        }
		System.out.println(answer);
	}

}
