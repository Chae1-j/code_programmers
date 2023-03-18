package codingTest_Basic;

public class 두수의합 {

	public static void main(String[] args) {
		/*
		 * 0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
		 */
		String a = "1234";
		String b = "4321";
		String answer = String.valueOf(Integer.valueOf(a)+Integer.valueOf(b));
		
		System.out.println(answer);
	}

}
/*
 * 		String answer = "";
        int carry = 0; 
        int i = a.length() - 1; 
        int j = b.length() - 1; 
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int num1 = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0; 
            int num2 = (j >= 0) ? Character.getNumericValue(b.charAt(j)) : 0; 
            
            int sum = num1 + num2 + carry; 
            carry = sum / 10;
            int digit = sum % 10; 
            
            answer = digit + answer; 
            
            i--;
            j--;

 */
