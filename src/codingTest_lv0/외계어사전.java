package codingTest_lv0;

public class 외계어사전 {

	public static void main(String[] args) {
		String[] spell = {"s", "o", "m", "d"};
		String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};
		int answer = 2;
		int cnt = 0;
		for(int i = 0; i < dic.length; i++) {
			for(int j = 0; j < spell.length; j++) {
				if(dic[i].contains(spell[j])) {
					cnt++;
				}
				if(cnt == spell.length) {
					answer = 1;
					break;
				}
			}
			cnt = 0;
		}
		System.out.println(answer);
	}

}
