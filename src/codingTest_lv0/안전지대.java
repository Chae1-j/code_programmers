package codingTest_lv0;

public class 안전지대 {

	public static void main(String[] args) {
		/*
		 * 지뢰찾기
		 */
		int[][] board = {{},{}};
//		int answer = 0;
//		for(int i = 0; i < board.length; i++) {
//			for(int j = 0; j < board[i].length; j++) {
//				if(board[i][j] == 1) {
//					
//				}
//			}
//		}
		
        int answer = 0;
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 0) {  // 안전한 지역인 경우
                    boolean isSafe = true;
                    for (int dx = -1; dx <= 1; dx++) {
                        for (int dy = -1; dy <= 1; dy++) {
                            int nx = i + dx;
                            int ny = j + dy;
                            if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && board[nx][ny] == 1) {
                                isSafe = false;
                                break;
                            }
                        }
                        if (!isSafe) {
                            break;
                        }
                    }
                    if (isSafe) {
                        answer++;
                    }
                }
            }
        }


		System.out.println(answer);
	}

}
