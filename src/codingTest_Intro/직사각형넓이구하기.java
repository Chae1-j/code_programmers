package codingTest_Intro;

public class 직사각형넓이구하기 {

	public static void main(String[] args) {
		/*
		 * 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 직사각형 네 꼭짓점의 좌표
		 *  [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 
		 *  직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
		 */
		int answer = 0;
		int[][] dots = {
						{-1,-1},
						{1,1},
						{1,-1},
						{-1,1}
						};
		int xMin = dots[0][0];
		int xMax = dots[0][0];
		int yMin = dots[0][1];
		int yMax = dots[0][1];
		
		for(int i = 0; i < 4; i++) {
			if(dots[i][0]>xMax) {
				xMax = dots[i][0];
			} else if(dots[i][0]<xMin) {
				xMin = dots[i][0];
			} else if(dots[i][1]>yMax) {
				yMax = dots[i][1];
			} else if(dots[i][1]<yMin) {
				yMin = dots[i][1];
			}
		}
		System.out.println("xMin : " + xMin + " & xMax : " + xMax);
		answer = (xMax-xMin)*(yMax-yMin);
		System.out.println("x의 길이 : "+ (xMax-xMin) + " y의 길이 : " + (yMax-yMin));
		System.out.println(answer);
	}

}
