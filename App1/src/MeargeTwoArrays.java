import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MeargeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Integer[]a = {1,2,3,4};
		 Integer[]b = {4,16,1,2,3,22};
		 String[] ab = new String [] {"satish","Kumar","Ragesh","Gollaa"};
		 int[]c = new int[a.length+b.length];
		 List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(a));
		 Object[] elem=list1.toArray();
		 
		 for(int i=0 ; i <elem.length ;i++) {
			 System.out.println(elem[i]);
		 }
		 System.out.println("***********************************");
		 for (Object ele:elem) {
			 System.out.println(ele);
		 }
		 System.out.println("+================================");
		 Iterator it = list1.iterator();
		 while (it.hasNext()) {
			 int st = (int)it.next();
		 System.out.println(st);
		 }
		 System.out.println("$$$$$$$$$$$$$$$$$$$$");
		 list1.forEach( s->System.out.println(s));
		 }

}
