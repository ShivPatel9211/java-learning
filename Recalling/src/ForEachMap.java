import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class ForEachMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> list=new HashMap<Integer,String>();
		list.put(1,"Ram"); 
		list.put(2, "Shiv");
		for(Entry<Integer, String> entry : list.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		list.forEach((k,v)->{
			System.out.println(k+":"+v);
		});
	}

}