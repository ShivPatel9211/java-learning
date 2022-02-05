import java.util.*;

public class OddInList {
public static void main(String[] args) {
	List <Integer> l1=new ArrayList<Integer>();
	List <Integer> l2=new ArrayList<Integer>();
	l1.addAll(Arrays.asList(1,3,5,7,9));
	l2.addAll(Arrays.asList(1,4,7));
	Iterator itr = l1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println(checkodd(l1));
//	System.out.println(checkodd(l2));
}
public static boolean checkodd(List<Integer> list) {
	for(int i : list) {
		if(i%2==0) {
			return false;
		}
	}
	return true;
}
}
