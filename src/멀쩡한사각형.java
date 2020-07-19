
public class 멀쩡한사각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public long solution(int w, int h) {

		long res = 0;

		int gcd = 0;

		for (int i = 1; i <= Math.min(w, h); i++) {
			if (w % i == 0 && h % i == 0) {
				gcd = i;
			}
		}

		res = (long)w * (long)h - gcd * ((w / gcd) + (h / gcd) - 1);

		return res;

	}

	long solution2(int w, int h) {
		int gcd = 0;
		long sum = (long) w * (long) h;

		for (int i = (w < h) ? w : h; i > 0; i--) { // 최대 공약수 구하기
			if ((w % i == 0) && (h % i == 0)) {
				gcd = i;
				break;
			}
		}
		return sum - gcd * ((w / gcd) + (h / gcd) - 1);
	}
}
