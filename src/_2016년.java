
public class _2016년 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	static public String solution(int a, int b) {
		String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		
		int day_sum = 0;
		
		for (int i = 1; i < a; i++) {
			day_sum += month[i];
		}
		
		day_sum += b-1;
		
		String answer = day[day_sum%7];
		
		return answer;
	}
}
