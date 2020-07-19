import java.util.Stack;

public class 크레인인형뽑기 {

	public static void main(String[] args) {
		System.out.println(solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}} , new int[] {1,5,3,5,1,2,1,4}));
	}
	
	static public int solution(int[][] board, int[] moves) {
		
		Stack<Integer> stck = new Stack<Integer>();
		
		int answer = 0;

		for (int i = 0; i < moves.length; i++) {
			int val = find(board,moves[i]);
//			System.out.println(val);
			if(val != 0) {
				if(stck.size() != 0) {
					if(stck.peek() == val) {
						stck.pop();
//						System.out.println(a+" sadasdasd");
						answer+=2;
					}else {
						stck.add(val);
					}
				}else {
					stck.add(val);
				}
			}
		}
		
        return answer;
    }
	
	static int find(int[][] board,int y) {
		
		for (int i = 0; i < board.length; i++) {
			if(board[i][y-1] != 0) {
				int temp = board[i][y-1];
				board[i][y-1] = 0;
				return temp;
			}else {
				continue;
			}
		}
		
		return 0;
	}

}
