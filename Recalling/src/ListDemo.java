import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<String> l1=new ArrayList<String>();
		 l1.add("Ram");
		 l1.add("sita");
		 l1.add("Apple");
		 System.out.println(l1);
		 Collections.sort(l1);
		 System.out.println(l1);
		 for (String i:l1)
		 {
		 System.out.println(i);
	}
		 List <Integer> l2=new ArrayList<Integer>();
		 l2.addAll(Arrays.asList(1,2,3,4,5,6,3));
		 System.out.println(l2);
}
}
