
public class SwapNumbers {
public static void main(String[] args) {
	Swap(5, 7);
}
public static void Swap(int a, int b) {
	b=a+b; 
	a=b-a;
	b=b-a;
	
	System.out.printf("this is after swaping %d, %d",a,b);
	
}
}
