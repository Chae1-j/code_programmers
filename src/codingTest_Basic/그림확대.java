package codingTest_Basic;

public class 그림확대 {

	public static void main(String[] args) {
		/*
		 * 직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다. 이 그림 
		 * 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때, 이 그림 파일을 가로 세로로 k배 늘린 그림 
		 * 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
		 */
		
		String[] picture = {};
		int k = 0;
		
		int height = picture.length; 
		int width = picture[0].length(); 
		
		int nh = height * k; 
		int nw = width * k;
		
		String[] answer = new String[nh]; 
		
		for (int i = 0; i < nh; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < nw; j++) {
				char pix = picture[i / k].charAt(j / k);
				sb.append(pix);
			}
			answer[i] = sb.toString();
		}
		System.out.println(answer);
	}

}
