
public class 모의고사 {

	public static void main(String[] args) {
//		System.out.println( solution( new int[] {1,2,3,4,5} ).toString() );
	}
	
	/*
	 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
		1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
		2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
		3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
		1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	 */
	
	/*
	 * 시간복잡도 O(n)
	 * 공간복잡도 O(n)
	 */
    public static int[] solution(int[] answers) {
    	
        
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] res = new int[4];
        
        for (int i = 0; i < answers.length; i++) {
			if(answers[i] == arr1[i%5]) {
				res[1]++;
			}
			if(answers[i] == arr2[i%8]) {
				res[2]++;
			}
			if(answers[i] == arr3[i%10]) {
				res[3]++;
			}
		}
        
        int max = 0;
        int maxcnt = 0;
        
        // 최댓값과 그 인덱스를 저장해야함.
        for (int i = 1; i <= 3; i++) {
			if(max < res[i]) {
				max = res[i];
				maxcnt = 1;
			}else if( max == res[i]) {
				maxcnt++;
			}
		}
        
        
        int[] answer = new int[maxcnt];
        int j = 0;
        
        for (int i = 1; i <= 3; i++) {
			
        	if(max == res[i]) {
        		answer[j] = i;
        		j++;
        	}
        	
		}
        
        return answer;
    }

}
