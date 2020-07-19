
public class 시저암호 {

	public static void main(String[] args) {
		
		char a = 'a';
		
//		System.out.println( 'a'-0 );
//		System.out.println( 'z'-0 );
//		System.out.println( 'A'-0 );
//		System.out.println( 'Z'-0 );
//		System.out.println( 'Y'-0 );
//		System.out.println( 'X'-0 );
//		System.out.println( ' '-0 );
		
		
		System.out.println(solution("a bcde yz ABCDE XYZ", 25));
		
//		System.out.println('X' + 25 - 26);
//		System.out.println('s' - 0);
		
//		90
	}
	/*
	 	문제 설명
		어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
		 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다. 
		 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
		
		제한 조건
		공백은 아무리 밀어도 공백입니다.
		s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
		s의 길이는 8000이하입니다.
		n은 1 이상, 25이하인 자연수입니다.
	 */
	
	// 97 - 122
	// 65 - 90
	
    public static String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == ' ') {
				answer += c;
			}else {
				// 소문자
				if( (c + n) > 122 ) {
					answer += (char)(c + n - 26);
					continue;
				}else if( c >= 97 ){
					answer += (char)(c + n);
					continue;
				}
				
				// 대문자
				if( (c + n) > 90 ) {
					answer +=  (char)(c + n - 26);
					continue;
				}else if( c >= 65 ){
					answer += (char)(c + n);
					continue;
				}
			}
		}
        return answer;
    }

}
