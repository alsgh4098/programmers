import java.util.Arrays;

public class 소수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/* 문제 설명
		1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
		
		소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
		(1은 소수가 아닙니다.)
		
		제한 조건
		n은 2이상 1000000이하의 자연수입니다.
	 */
    public int solution(int n) {
    	
    	boolean[] primeNum = new boolean[n+1];
    	
    	Arrays.fill(primeNum, true);
    	
    	for (int i = 2; i < primeNum.length; i++) {
			for (int j = 2; i*j < primeNum.length && j < primeNum.length; j++) {
				primeNum[i*j] = false;
			}
		}

    	int answer = 0;
    	
    	for (int i = 2; i < primeNum.length; i++) {
			if(primeNum[i]) {
				answer++;
			}
		}
    	
    	
        return answer;
    }

}
