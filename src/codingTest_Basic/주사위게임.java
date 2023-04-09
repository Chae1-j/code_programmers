package codingTest_Basic;

import java.util.Arrays;
import java.util.Scanner;

public class 주사위게임 {

	public static void main(String[] args) {
		/*
		 * 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 
		 * 점수를 얻습니다.
		 * - 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
		 * - 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 
		 * 	 (10 × p + q)2점을 얻습니다.
		 * - 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 
		 * 	 (p + q) × |p - q|점을 얻습니다.
		 * - 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, 
		 * 	 r(q ≠ r)이라면 q × r점을 얻습니다.
		 * - 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
		 * 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 
		 * solution 함수를 작성해 주세요.
		 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int answer = 0;
        int[] num = new int[4];
        num[0]=a;
        num[1]=b;
        num[2]=c;
        num[3]=d;
        int multi = 1;
        Arrays.sort(num);
        int[] dice = new int[6];
        for(int i=0;i<4;i++){
            dice[num[i]-1]++;
        }
        
        for(int i=0;i<6;i++){
            if(dice[i]==4){
                answer=1111*(i+1);
                break;
            } else if(dice[i]==3){
                for(int j=0;j<6;j++){
                    if(dice[j]==1){
                        answer=(10*(i+1)+(j+1))*(10*(i+1)+(j+1));
                        break;
                    }
                }
            } else if(dice[i]==2){
               for(int j=0;j<6;j++){
                    if(dice[j]==2){
                        if(i==j){
                            continue;
                        } else{
                            answer=(i+1+j+1)*((i+1)-(j+1));
                            break;
                        } 
                    } else if(dice[j]==1){
                        multi=multi*(j+1);
                   }
                }
                if(multi!=1){
                    answer=multi;
                }
            }
            if(num[0]!=num[1] && num[1]!=num[2] && num[2]!=num[3]){
                answer=num[0];
            }   
        }
        System.out.println(answer);
	}

}
