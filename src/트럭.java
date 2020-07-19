import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class 트럭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2	10	[7,4,5,6]
//		100	100	[10]
//		100	100	[10,10,10,10,10,10,10,10,10,10]
		
		System.out.println(solution(2, 10, new int[] {7,4,5,6}));
		System.out.println(solution(100, 100, new int[] {10}));
		System.out.println(solution(100, 100, new int[] {10,10,10,10,10,10,10,10,10,10}));
	}
	
	static class Truck{
		int time;
		int weight;
		
		public Truck(int time, int weight) {
			super();
			this.time = time;
			this.weight = weight;
		}

		public Truck(int weight) {
			super();
			this.weight = weight;
		}
		
		
		
	}
	
	
    static public int solution(int bridge_length, int weight, int[] truck_weights) {
    	
    	
    	Queue<Truck> bridge = new LinkedList<Truck>();
    	
    	Queue<Truck> trucks = new LinkedList<Truck>();
    	
    	for (int i = 0; i < truck_weights.length; i++) {
			trucks.add(new Truck(0,truck_weights[i]));
		}
    	
    	int bridge_weight = 0;
    	int time = 0;
    	int size = trucks.size();
    	int cnt = 0;
    	
    	while(!bridge.isEmpty() || !trucks.isEmpty()) {
    		
    		time++;
    		
    		if(!bridge.isEmpty()) {
    			
    			if(time - bridge.peek().time >= bridge_length) {
    				bridge_weight -= bridge.peek().weight;
    				bridge.poll();
    			}
    			
    			
    		}
    		
    		if(!trucks.isEmpty()) {
    			if(trucks.peek().weight+bridge_weight <= weight) {
    				bridge_weight += trucks.peek().weight;
    				bridge.add(new Truck(time,trucks.peek().weight));
    				trucks.poll();
    			}
    		}
    		
    	}
        return time;
    }
}
