package codingTest_LV1;
import java.util.*;
public class 이천십육년 {

	public static void main(String[] args) {
		/*
		 *2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 
		 *요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,
		 *FRI,SAT입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요. 
		 */
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String answer = "";
		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
	    int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	    int allDate = 0;
	    for (int i = 0; i < a - 1; i++) {
	       allDate += date[i];
	    }
	 
	    allDate += (b - 1);
	    answer = day[allDate % 7];
		System.out.println(answer);
	}

}
