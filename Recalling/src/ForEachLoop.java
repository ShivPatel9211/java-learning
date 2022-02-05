import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("Ram", 12));
		list.add(new Person("Shyam", 13));
		list.add(new Person("Sita", 17));
		list.add(new Person("Sital", 22));
		list.add(new Person("Shiv", 25));
//		for(Person person:list) {
//			System.out.println(person.getName() +" : "+person.getAge());
//		}
		list.forEach((p)->{
			System.out.println(p.getName() +" : "+p.getAge());
		});
		list.stream().forEach((p)->{
			System.out.println(p.getName() +" : "+p.getAge());
		});
	}

}

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}