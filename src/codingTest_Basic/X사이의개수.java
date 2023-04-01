package codingTest_Basic;

public class X사이의개수 {

	public static void main(String[] args) {
		/*
		 * 문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 
		 * 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
		 */
		String myString = "";
	 	int[] answer = {};
        String[] str = myString.split("x",-1);
        answer = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            answer[i] = str[i].length();
        }

	}

}
