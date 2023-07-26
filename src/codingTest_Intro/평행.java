package codingTest_Intro;

import java.util.Arrays;

public class 평행 {

	public static void main(String[] args) {
		/*
		 *점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
		 *			[[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
		 * 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 
		 * return 하도록 solution 함수를 완성해보세요.
		 */
//		int x1 = dots[0][0];
//        int y1 = dots[0][1];
//        int x2 = dots[1][0];
//        int y2 = dots[1][1];
//        int x3 = dots[2][0];
//        int y3 = dots[2][1];
//        int x4 = dots[3][0];
//        int y4 = dots[3][1];
//        
//        double slope1 = (double) (y2 - y1) / (x2 - x1);
//        double slope2 = (double) (y4 - y3) / (x4 - x3);
//        
//        return slope1 == slope2 ? 0 : 1;
		int[][] dots = {{3,5},
						{4,1},
						{2,4},
						{5,10}};
		int answer = 0;
//		int first = dots[0][0];
//		int second = dots[0][0];
//		int third = dots[0][0];
//		int fourth = dots[0][0];
//		int x = 0;
//		int y = 0;
//		for(int i = 0; i < dots.length; i++) {
//			if(dots[i][0] > first) {
//				first = Math.max(dots[i][0],dots[i][0]);
//			}
//		}
		
//		int[] cnt = new int[6]; 
//		
//        int index = 0; 
//
//        for(int i = 0; i < 3; i++) {
//            for(int j = i + 1; j < 4; j++) {
//                int result = (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
//                cnt[index] = result;
//                index++;
//            }
//        }
//
//        for(int i = 0; i < cnt.length-1 ; i++){
//            for(int j = i+1; j < cnt.length; j++) {
//                if (cnt[i] == cnt[j]) answer = 1;
//            }
//        }
//	      int answer = 0;
//	        float[] line = new float[6]; //기울기 세는 배열
//
//	        //index로 돌리면서 바로 채움 line에
//	        int index = 0; 
//
//	        for(int i = 0; i < 3; i++) {
//	            for(int j = i + 1; j < 4; j++) {
//	                float result 
//	                    = (float)(dots[i][1] - dots[j][1]) 
//	                    / (float)(dots[i][0] - dots[j][0]);
//	                line[index] = result;
//	                index++;
//	            }
//	        }
//
//	        //평행 체크
//	        for(int k = 0; k < line.length-1 ; k++){
//	            for(int m=k+1; m<line.length;m++) {
//	                if (line[k] == line[m]) return 1;
//	            }
//	        }
        
		int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];
        if((double) Math.abs(y1-y2)/Math.abs(x1-x2) == (double)Math.abs(y3-y4)/Math.abs(x3-x4)) {
            answer = 1;
        }else if((double)Math.abs(y1-y3)/Math.abs(x1-x3) == (double)Math.abs(y2-y4)/Math.abs(x2-x4)) {
            answer = 1;
        }else if((double)Math.abs(y1-y4)/Math.abs(x1-x4) == (double)Math.abs(y2-y3)/Math.abs(x2-x3)) {
            answer = 1;
        }
		System.out.println(answer);
	}

}
