
public class _124나라의숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(solution(20));
	}
	
	static public String solution(int n) {
        return makeNum(n,"");
    }
	
	static String makeNum(int n, String line) {

		if(n<=3) {
			if(n == 1) {
				return "1"+line;
			}
			
			if(n == 2) {
				return "2"+line;
			}
			
			if(n == 3 || n == 0) {
				return "4"+line;
			}
		}
		
		String num1 = makeNum((n-1)/3,line);
		
		String num2 = makeNum(n%3,line);
		
		
		return num1+num2;
	}

}
