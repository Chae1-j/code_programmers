package codingTest_Basic;

import java.util.ArrayList;

public class 배열만들기2 {

	public static void main(String[] args) {
		/*
		 * 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 
		 * 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
		 * 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
		 */
        int[] answer = {};
        int l = 0;
        int r = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++){
            String str = String.valueOf(i);
            String[] arr = str.split("");
            int count = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[j].equals("5") || arr[j].equals("0")){
                    count++;
                }
            }

            if (count == arr.length){
                list.add(i);
            }
        }

        answer = new int[list.size()];
        if (list.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        
        else {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = (int) list.get(i);
            }
        }
        System.out.println(answer);
	}

}
