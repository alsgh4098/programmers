

public class 땅따먹기 {

	public static void main(String[] args) {
		System.out.println(solution(new int[][] {{1,2,3,5},{5,6,7,8},{4,3,2,1}}));
	}
	
	static int solution(int[][] land) {
		int N = land.length;
		int M = 4;
		int answer = Integer.MIN_VALUE;
		int[][] dp = new int[N][M];
		
		
        for (int i = 0; i < M; i++) {
			dp[0][i] = land[0][i];
		}
        
        for (int i = 1; i < N; i++) {
			for (int j = 0; j < M; j++) {
				for (int k = 0; k < M; k++) {
					if( j != k) {
						dp[i][j] = Math.max(dp[i][j], land[i][j]+dp[i-1][k]);
					}
				}
			}
		}
        
//        for (int i = 0; i < N; i++) {
//			for (int j = 0; j < M; j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
        
        for (int i = 0; i < M; i++) {
        	if(answer<dp[N-1][i]) {
        		answer = dp[N-1][i];
        	}
		}

        return answer;
    }

}
