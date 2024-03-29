package codingTest_lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 실패율 {

	public static void main(String[] args) {
		/*
		 * 슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다. 그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만, 요즘 신규 사용자의 수가 
		 * 급감한 것이다. 원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다. 이 문제를 어떻게 
		 * 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다. 역시 슈퍼 개발자라 대부분의 로직은 쉽게 
		 * 구현했지만, 실패율을 구하는 부분에서 위기에 빠지고 말았다. 오렐리를 위해 실패율을 구하는 코드를 완성하라.
		 * 
		 * 실패율은 다음과 같이 정의한다. 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 
		 * 플레이어 수
		 * 
		 * 전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 
		 * 주어질 때, 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 
		 * 함수를 완성하라.
		 */
		int N = 5; 
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] answer = new int[N];
//		Arrays.sort(stages);
//		System.out.println(Arrays.toString(stages));
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		int cnt;
//
//		for(int j = 1; j <= N; j++) {
//			cnt = 0;
//			for(int i = 0; i < stages.length; i++) {
//				if(stages[i] == j) {
//					cnt++;
//				}
//			}
//			list.add(cnt);
//		}
//		for(int i = 0; i < list.size(); i++) {
//			answer[i] = (list.get(i)/stages.length);
//		}
//		System.out.println(list);
	        int noclear=0; 
	        int player=stages.length;
	        Map<Integer, Double> stagefail = new HashMap<Integer, Double>(); 
	        for(int i=1; i<=N;i++){
	            for(int s : stages){
	                if(s==i) noclear++;
	            }
	            if(player==0) stagefail.put(i,0.0);
	            else{
	                stagefail.put(i,(double)noclear/player); 
	                player -= noclear;
	                noclear=0;
	            }
	        }
	        List<Map.Entry<Integer, Double>> list_entries = new ArrayList<Map.Entry<Integer, Double>>(stagefail.entrySet());
	        Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Double>>() {
	            public int compare(Map.Entry<Integer, Double> obj1, Map.Entry<Integer, Double> obj2) {
	                return obj2.getValue().compareTo(obj1.getValue());
	            }
	        });

	        int c=0;
	        for(Map.Entry<Integer, Double> entry : list_entries) {
	            answer[c]=entry.getKey(); c++;
	        }
		System.out.println(Arrays.toString(answer));
		
	}

}
