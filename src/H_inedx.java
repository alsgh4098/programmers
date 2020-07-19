import java.util.Arrays;

public class H_inedx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(solution(new int[] {3, 0, 6, 1, 5 , 8 ,9 ,10}));
		System.out.println(solution(new int[] {1,7,0,1,6,4}));
		System.out.println(solution(new int[] {3,0,2,0,0,0}));
	}
	
    static public int solution(int[] citations) {
    	
    	int[] temp = citations;
    	
    	Arrays.sort(temp);
    	// 7 6 4 1 1 0
    	// 5 4 3 2 1 0
    	
    	// 3 2 0 0 0 0
    	// 5 4 3 2 1 0
    	
    	// 0 1 1 4 6 7
    	// 0 1 2 3 4 5
    	
    	// 0 0 0 0 2 3
    	// 0 1 2 3 4 5
    	
    	int res = 0;
    	
    	for (int i = 0; i < temp.length-1 ; i++) {
//    		System.out.println(temp[i]+" "+i);
    		if(temp.length-i <= temp[i]) {
    			res = temp.length-i;
    			break;
    		}
    	}
        return res;
    }
}
