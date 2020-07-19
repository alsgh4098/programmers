
public class 두정수사이의합 {

	public static void main(String[] args) {
		
		System.out.println(solution(3,5));
		System.out.println(solution(3,3));
		System.out.println(solution(5,3));
		
	}
	
    static public long solution(int a, int b) {
    	
    	
    	int big = 0;
    	int small = 0;
    	
    	if(a < b) {
    		big = b;
    		small = a;
    	}else {
    		big = a;
    		small = b;
    	}
    	
    	if(big==small) {
    		return big;
    	}
    	
    	long sum = 0;
    	
    	for (int i = small; i <= big; i++) {
			sum += i;
		}
    	
    	return sum;
    }

}
