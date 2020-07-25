
import java.util.Arrays;
import java.util.Comparator;

public class 실패율 {

	public static void main(String[] args) {

	}
	
	/*
	 	실패율은 다음과 같이 정의한다.
		스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
		전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 
		실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.
	 */
    public int[] solution(int N, int[] stages) {
//    	1번부터 사용하기 위해서
    	float[] clear = new float[N + 1];
    	float[] notClear = new float[N + 1];
    	
    	Pair[] pairArr = new Pair[N];
    	
    	for (int i = 0; i < stages.length; i++) {
			for (int j = 1; j < stages[i]; j++) {
				
				clear[j]++;
			}
			
			if(stages[i] < N+1)
			notClear[stages[i]]++;
		}
    	
    	for (int i = 0; i < pairArr.length; i++) {
    		if( (notClear[i+1]+clear[i+1]) == 0) {
    			pairArr[i] = new Pair(0f,i+1);
    			continue;
    		}
    		pairArr[i] = new Pair(notClear[i+1]/(notClear[i+1]+clear[i+1]),i+1);
		}
    	
    	
    	Arrays.sort(pairArr, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				if( o1.score < o2.score ) {
					return 1;
				}else if( o1.score == o2.score ) {
					if( o1.idx > o2.idx ) {
						return 1;
					}else if( o1.idx == o2.idx ) {
						return 0;
					}else {
						return -1;
					}
				}else {
					return -1;
				}
			}
		});
    	
    	int[] answer = new int[N];
    	
    	for (int i = 0; i < answer.length; i++) {
    		answer[i] = pairArr[i].idx;
		}
    	
    	
    	return answer;
    }
    
    public class Pair{
    	float score;
    	int idx;
    	
		public Pair(float score, int idx) {
			super();
			this.score = score;
			this.idx = idx;
		}
    }

}
