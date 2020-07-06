import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class TargetTwoNoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		List<Integer> lt= resultArray(new int[] {1,7,5,8,5},9);
		lt.forEach(s->System.out.println(s));
	}
	private static List resultArray(int[] input, int target) {
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int index=0;
		for(int i : input) {
	       if(map.containsValue(target-i)) {
	    	   list.add(target-i);
	    	   list.add(i);
	    	   //int[] array = list.stream().mapToInt(i->i).toArray();
	       }else {
			map.put(index,i); 
	    	index++;   
		}
		}
		return list;
		// TODO Auto-generated method stub
	}
}
