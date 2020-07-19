import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 가장큰수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] {0,0,0}));
	}
	
	
	static public String solution(int[] numbers) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < numbers.length; i++) {
			list.add(Integer.toString(numbers[i]));
		}
		
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(Integer.parseInt(o1+o2) > Integer.parseInt(o2+o1)) {
					return -1;
				}else if(Integer.parseInt(o1+o2) < Integer.parseInt(o2+o1)){
					return 1;
				}else {
					return 0;
				}
				
			}
		});
		
		
		boolean check = true;
		String answer = "";
		
		for (int i = 0; i < list.size(); i++) {
			String num = list.get(i);
			if(num.equals("0")) {
				
			}else {
				check = false;
			}
			answer += num;
			
		}
		
		if(check) {
			answer = "0";
		}
		
        return answer;
    }

	
}
