import java.util.Arrays;

public class 완주하지못한선수 {

	public static void main(String[] args) {
//		System.out.println(solution());
	}
	
	static public String solution(String[] participant, String[] completion) {

		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i;
		
		for (i = 0; i < completion.length; i++) {
			if(!completion[i].equals(participant[i])) {
				return participant[i];
			}
		}
		
        return participant[i];
    }

}
