import java.util.Arrays;
import java.util.PriorityQueue;

public class 더맵개 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static public int solution(int[] scoville, int K) {
		int answer = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = 0; i < scoville.length; i++) {
			pq.add(scoville[i]);
		}

		while (pq.peek() < K) {
			if (pq.size() == 1)
				return -1;

			int num1 = pq.poll();
			int num2 = pq.poll();

			pq.add(num1 + num2 * 2);

			answer++;

		}

		return answer;
	}

}
