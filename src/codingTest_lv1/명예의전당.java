package codingTest_lv1;
import java.util.*;
public class 명예의전당 {

	public static void main(String[] args) {
		/*
		 * "명예의 전당"이라는 TV 프로그램에서는 매일 1명의 가수가 노래를 부르고, 시청자들의 문자 투표수로 가수에게 점수를 
		 * 부여합니다. 매일 출연한 가수의 점수가 지금까지 출연 가수들의 점수 중 상위 k번째 이내이면 해당 가수의 점수를 명예의 
		 * 전당이라는 목록에 올려 기념합니다. 즉 프로그램 시작 이후 초기에 k일까지는 모든 출연 가수의 점수가 명예의 전당에 
		 * 오르게 됩니다. k일 다음부터는 출연 가수의 점수가 기존의 명예의 전당 목록의 k번째 순위의 가수 점수보다 더 높으면, 
		 * 출연 가수의 점수가 명예의 전당에 오르게 되고 기존의 k번째 순위의 점수는 명예의 전당에서 내려오게 됩니다. 이 
		 * 프로그램에서는 매일 "명예의 전당"의 최하위 점수를 발표합니다. 예를 들어, k = 3이고, 7일 동안 진행된 가수의 점수가 
		 * [10, 100, 20, 150, 1, 100, 200]이라면, 명예의 전당에서 발표된 점수는 아래의 그림과 같이 
		 * [10, 10, 10, 20, 20, 100, 100]입니다. 명예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 
		 * 가수들의 점수인 score가 주어졌을 때, 매일 발표된 명예의 전당의 최하위 점수를 return하는 solution 함수를 
		 * 완성해주세요.
		 */

		int k = 3;
		int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = new int[score.length];
        //명예의 전당에 해당하는 크기 k의 ArrayList를 생성
        ArrayList<Integer> list = new ArrayList<>(k);
		
        //list에 score의 원소 값을 하나씩 추가한 뒤 정렬
        //list의 크기가 k를 넘으면 안되므로 원소값 중 최솟값을 제거
        //for문 마지막에서 list의 첫번째 값을 정답 배열에 추가
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            list.sort(Comparator.naturalOrder());
            if (list.size() > k) {
                list.remove(0);
            }
            answer[i] = list.get(0);
        }

	}

}
