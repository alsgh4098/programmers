//import java.util.ArrayList;
//
//public class 프렌즈대학교 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	
//	
//    static public int solution(String[][] relation) {
//    	
//    	String[][] temp = relation;
//    	
//    	int N = temp.length;
//    	int M = temp[0].length;
//    	
//    	int cnt = 0;
//    	
//    	// 단일 후보키가 되지 못하는 키들.
//    	// 열을 담는다.
//    	ArrayList<Integer> list = new ArrayList<Integer>();
//    	
//    	ArrayList<String> chlist;
//    	
//    	// 열/ 컬럼
//    	for (int i = 0; i < N; i++) {
//    		chlist = new ArrayList<String>();
//    		boolean check = true;
//    		// 행
//			for (int j = 0; j < M; j++) {
//				if(chlist.contains(temp[j][i])) {
//					list.add(i);
//					// 중복되는 것이 있다면 후보키가 되지 못하는 것을 담는 리스트에 담고 해당 열 탐색 반복문들 종료한다.
//					check = false;
//					break;
//				}else {
//					chlist.add(temp[j][i]);
//					continue;
//				}
//			}
//			
//			// 중복되는 값 없이 후보키가 가능하다면
//			if(check) {
//				cnt++;
//			}
//		}
//    	
//    	
//    	
//    	for (int i = 0; i < list.size(); i++) {
//    		
//    		int col1 = list.get(i);
//    		
//    		for (int j = 0; j < list.size(); j++) {
//				
//    			if(i!=j) {
//    				
//    			}
//    			
//    			
//			}
//			
//		}
//    	
//    	
//    	
//    	
//        return cnt;
//    }
//    
//    static int[] combi(int start, int cnt) {
//    	
//    }
//    
//    static int hoobo(String[][] relation) {
//    	String[][] temp = relation;
//    	
//    	int N = temp.length;
//    	int M = temp[0].length;
//    	
//    	int cnt = 0;
//    	
//    	// 단일 후보키가 되지 못하는 키들.
//    	// 열을 담는다.
//    	ArrayList<Integer> list = new ArrayList<Integer>();
//    	
//    	ArrayList<String> chlist;
//    	
//    	// 열/ 컬럼
//    	for (int i = 0; i < N; i++) {
//    		chlist = new ArrayList<String>();
//    		boolean check = true;
//    		// 행
//			for (int j = 0; j < M; j++) {
//				if(chlist.contains(temp[j][i])) {
//					list.add(i);
//					// 중복되는 것이 있다면 후보키가 되지 못하는 것을 담는 리스트에 담고 해당 열 탐색 반복문들 종료한다.
//					check = false;
//					break;
//				}else {
//					chlist.add(temp[j][i]);
//					continue;
//				}
//			}
//			
//			// 중복되는 값 없이 후보키가 가능하다면
//			if(check) {
//				cnt++;
//			}
//		}
//    	
//    	return cnt;
//    }
//    
//    
//}
