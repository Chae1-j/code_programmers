package codingTest_lv1;

import java.util.Arrays;

public class 로또의최고순위와최저순위 {

	private static final int case1 = 0;

	public static void main(String[] args) {
		/*
		 * 로또를 구매한 민우는 당첨 번호 발표일을 학수고대하고 있었습니다. 하지만, 민우의 동생이 로또에 낙서를 하여, 일부 번호를 
		 * 알아볼 수 없게 되었습니다. 당첨 번호 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 
		 * 알아보고 싶어 졌습니다. 알아볼 수 없는 번호를 0으로 표기하기로 하고, 민우가 구매한 로또 번호 6개가 44, 1, 0, 0, 
		 * 31 25라고 가정해보겠습니다. 당첨 번호 6개가 31, 10, 45, 1, 6, 19라면, 당첨 가능한 최고 순위와 최저 순위의 한 
		 * 예는 아래와 같습니다.
		 * 	- 순서와 상관없이, 구매한 로또에 당첨 번호와 일치하는 번호가 있으면 맞힌 걸로 인정됩니다.
		 * 	- 알아볼 수 없는 두 개의 번호를 각각 10, 6이라고 가정하면 3등에 당첨될 수 있습니다. > 3등을 만드는 다른 방법들도 
		 * 	  존재합니다. 하지만, 2등 이상으로 만드는 것은 불가능합니다.
		 * 	- 알아볼 수 없는 두 개의 번호를 각각 11, 7이라고 가정하면 5등에 당첨될 수 있습니다. > 5등을 만드는 다른 방법들도 
		 * 	  존재합니다. 하지만, 6등(낙첨)으로 만드는 것은 불가능합니다.
		 * 민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다. 이때, 당첨 
		 * 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
		 */
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int[] answer = new int[2];
		// 1번 풀이방법
		int zero = 0, same=0;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zero++;
                continue;    
            }
            for(int j=0;j<win_nums.length; j++){
                if(lottos[i] == win_nums[j])
                    same++;
            }
        }
        answer[0] = 7-(zero+same);
        answer[1] = 7-same;
        if(zero + same < 2)
            answer[0] = answer[1] = 6;
        if(answer[1] == 7)
            answer[1]--;
        // 2번 풀이방법
//        HashSet<Integer> lotto_num = new HashSet<>();
//        HashSet<Integer> win_num = new HashSet<>();
//
//        int zero_cnt = 0 ;
//        for(int l : lottos) {
//
//            if(l != 0) {
//                lotto_num.add(l);   
//            }else {
//                zero_cnt += 1;
//            }
//        }
//
//        for(int l : win_nums) {
//            if(l != 0) {
//                win_num.add(l); 
//            }
//        }
//
//        lotto_num.retainAll(win_num);  
//
////      result[0] = lotto_num.size();
////      result[1] = lotto_num.size() + zero_cnt;
//
//        int max_cnt = lotto_num.size() + zero_cnt; 
//        int min_cnt = lotto_num.size(); 
//
//
//
//        int[] answer = {0,0};
//        answer[0] = ranking(max_cnt);
//        answer[1] = ranking(min_cnt);
//
//
//        return answer;
//    }
//
//    public static int ranking(int cnt) {
//
//        if(cnt == 6) {
//            return 1;
//        }else if (cnt == 5) {
//            return 2;
//        }else if (cnt == 4) {
//            return 3;
//        }else if (cnt == 3) {
//            return 4; 
//        }else if (cnt == 2) {
//            return 5; 
//        }else {
//            return 6;
//        }
//    }
        
        // 내 풀이		
//		Arrays.sort(lottos);
//		Arrays.sort(win_nums);
//		int cnt = 0;
//		int cnt2 = 0;
//		for(int i = 0; i < 6; i++) {
//			if(lottos[i] == 0) cnt2++;
//			for(int j = 0; j < 6; j++) {
//				if(lottos[i] == win_nums[j]) cnt++; 
//			}
//		}
//		if(cnt == 0) {
//			answer[0] = 1;
//			answer[1] = 6;
//		} else if(cnt > 0 && cnt < 6) {
//			switch(cnt) {
//				case 1 : 
//					answer[1] = 6;
//					break;
//				case 2 :
//					answer[1] = 5;
//					break;
//				case 3 : 
//					answer[1] = 4;
//					break;
//				case 4 : 
//					answer[1] = 3;
//					break;
//				case 5 : 
//					answer[1] = 2;
//					break;
//			}
//		} else {
//			answer[0] = 1;
//			answer[1] = 1;
//		}
//		
//		System.out.println(cnt);
        
        
		System.out.println(Arrays.toString(answer));
	}

}
