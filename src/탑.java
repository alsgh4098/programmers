
public class 탑 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(new int[] {6,9,5,7,4});
	}

	static public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];

		for (int i = answer.length - 1; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (heights[j] > heights[i]) {
					answer[i] = j + 1;
					break;
				}
			}
		}

//		for (int i = 0; i < answer.length; i++) {
//			System.out.print(answer[i] + " ");
//		}
//		System.out.println();

		return answer;
	}

}
