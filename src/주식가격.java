
public class 주식가격 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] {1, 2, 3, 2, 3}));
	}
	
    static public int[] solution(int[] prices) {
    	int[] answer = new int[prices.length];
    	
    	for (int i = 0; i < prices.length; i++) {
    		
			for (int j = i+1; j < prices.length; j++) {
				
				if(prices[j]<prices[i] || j == prices.length-1) {
					answer[i] = j-i;
					break;
				}
				
			}
		}
    	
        return answer;
    }

}
