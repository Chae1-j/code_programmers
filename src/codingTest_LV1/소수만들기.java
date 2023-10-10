package codingTest_LV1;

import java.util.ArrayList;

public class 소수만들기 {

	public static void main(String[] args) {
		/*
		 * 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 
		 * 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 
		 * 하도록 solution 함수를 완성해주세요.
		 */
		int[] nums = {1,2,7,6,4};
		int answer = 0;
//		for(int i = 0; i < nums.length-2; i++) {
//			for(int j = i + 1; j < nums.length-1; j++) {
//				for(int k = j + 1; k < nums.length; k++) {
//					int sum = nums[i] + nums[j] + nums[k];
//					if(sum % 2 != 0 && sum % 3 != 0 && sum % 5 != 0 && sum % 7 != 0) {
//						answer++;
//						System.out.println("소수 sum = " + sum);
//					}
//					if(sum == 7) answer++;
//					System.out.println("sum = " + sum);
//				}
//			}
//		}
		ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
        	if(i + 2 >= nums.length) break;
        	for(int j = i + 1; j < nums.length; j++) {
        		for(int h = j + 1; h < nums.length; h++) {
        			list.add(nums[i] + nums[j] + nums[h]);
        		}
        	}
        }
        
        for(Integer i : list) {
        	int count = 2;
        	answer++;
        	while(count < i) {
        		if(i % count == 0) {
        			answer--;
        			break;
        		}
        		count++;
        	}
        }
		
		System.out.println(answer);
	}

}
