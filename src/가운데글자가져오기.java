
public class 가운데글자가져오기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( solution("qwer"));
	}
	
	/*
	 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	 * 재한사항
	 * s는 길이가 1 이상, 100이하인 스트링입니다.
	 */
    public static String solution(String s) {
    	
    	int len = s.length();
    	String answer = "";
    	
    	if( len%2 == 0) {
    		answer += s.charAt( (len/2) - 1);
    		answer += s.charAt( (len/2) );
    	}else {
    		answer += s.charAt(len/2);    		
    	}
    	
    	
        return answer;
    }
    
}
