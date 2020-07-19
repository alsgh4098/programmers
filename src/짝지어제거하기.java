import java.util.Stack;

public class 짝지어제거하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("baaba"));
	}
	
	static public int solution(String s) {
		int res = 0;

		char[] line = s.toCharArray();

		Stack<Character> st1 = new Stack<Character>();
		for (int i = 0; i < line.length; i++) {
			st1.add(line[i]);
		}
		Stack<Character> st2 = new Stack<Character>();
		
		while(true) {
			boolean finish = true;
			
			while(st1.size() != 0) {
				
				if(st2.size() != 0) {
					char temp = st1.pop();
					if(st2.peek() == temp) {
						st2.pop();
						finish = false;
						continue;
					}else {
						st2.add(temp);
					}
				}else {
					st2.add(st1.pop());
				}
				
			}
			
			while(st2.size() != 0) {
				st1.add(st2.pop());
			}
			
			if(finish) {
				break;
			}
			
			if(st1.size() == 0) {
				res = 1;
				break;
			}
		}

		return res;
	}
}
