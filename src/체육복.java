import java.util.Arrays;

public class 체육복 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( sol2(5, new int[] {1,2,3}, new int[] {1,2,3} ));
	}	
	
	/*
	 * 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 
	 * 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
	 * 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
	 * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
	 * 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요
	 */
	
//	n=5;  lost={1,4}; reserve={2,4}
    public static int solution(int n, int[] lost, int[] reserve) {
    	
    	int[] student = new int[n+1];
    	
    	Arrays.fill(student, 1);
    	
    	for (int i = 0; i < lost.length; i++) {
			student[lost[i]]--;
		}
    	
    	for (int i = 0; i < reserve.length; i++) {
			if( student[reserve[i]] == 0) {
				student[reserve[i]]++;
			}else if( (reserve[i] - 1) >= 1 && student[reserve[i] - 1] == 0 ) {
				student[reserve[i] - 1]++;
			}else if( (reserve[i] + 1) <= n && student[reserve[i] + 1] == 0 ) {
				student[reserve[i] + 1]++;
			}
		}
    	
    	int answer = 0;

    	for (int i = 1; i < student.length; i++) {
    		if(student[i] == 1) {
    			answer++;
    		}
		}
    	
        return answer;
    }
    
//    0 1 1 0 1 0 0 0
//    0 0 0 0 1 1 1 0
//	n=5;  lost={1,4}; reserve={2,4}
    
    public static int sol2(int n, int[] lost, int[] reserve) {
    	
    	boolean[] student = new boolean[n+1];
    	
    	Arrays.fill(student, true);
    	
    	for (int i = 0; i < lost.length; i++) {
    		student[lost[i]] = false;
		}
    	
    	// 자신의 도난여부부터 확인하고, 도난 당했을 경우 여분을 사용하고 -1로 변경시킨다.
    	for (int i = 0; i < reserve.length; i++) {
			if( reserve[i] != -1 && student[reserve[i]] == false ) {
				student[reserve[i]] = true;
				reserve[i] = -1;
			}
		}
    	// 자신의 도난여부를 확인하고 도난되지 않은 학생의 여분을 앞 뒤 도난된 학생에게 빌려준다.
    	for (int i = 0; i < reserve.length; i++) {
    		if(reserve[i] != -1 ) {
    			if( (reserve[i] - 1) >= 1 && student[reserve[i] - 1] == false ) {
    				student[reserve[i] - 1] = true;
    			}else if( (reserve[i] + 1) <= n && student[reserve[i] + 1] == false ) {
    				student[reserve[i] + 1] = true;
    			}
    		}
		}
    	
    	
    	int answer = 0;

    	for (int i = 1; i < student.length; i++) {
    		if(student[i]) {
    			answer++;
    		}
		}
        return answer;
    }

}
