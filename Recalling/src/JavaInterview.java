import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class JavaInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		reverse();
//		CountString();
//		ArmstrongNumber();
//		RemoveWhiteSpaces();
//		IntegerPalindrome();
//		RemoveDuplicatesfromArrayList();
		
		System.out.println(isLeapYear(2020));
	}
	
	public static void reverse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=new String();
		s=sc.nextLine();
		StringBuilder stb=new StringBuilder();
//		stb.append(s);
//		stb.reverse();
		char[] n=s.toCharArray();
		int len =n.length-1;
		for(int i=len;i>=0;i--) {
			
			stb.append(n[i]);
		}
		System.out.println("The reverse string is:"+stb.toString());
	}
//	Write a Java Program to count the number of words in a string using HashMap.
	
	public static void CountString() {
//		to count the string 
		String st ="this is testing is this";
		int count=0;
		String[] split= st.split(" ");
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		for(int i =0; i<split.length;i++) {
			if(map.containsKey(split[i])) {
				count=map.get(split[i]);
				count++;
				map.replace(split[i], count);
			}
			else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
		
//		to count character
		String input="hello";
		HashMap<Character, Integer> hash=new HashMap<Character, Integer>();
		for(int j=0;j<input.length();j++) {
			char c=input.charAt(j);
			if(hash.containsKey(c)) {
				count=hash.get(c);
				count++;
				hash.replace(c, count);
			}
			else
				hash.put(c, 1);	
		}
		for(Character k : hash.keySet()) {
			System.out.println(k +" :"+ hash.get(k));
		}
		
	}
	public static void ArmstrongNumber() {
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		String s=Integer.toString(num);
		int len=s.length();
		int sum=0;
		for(int i=0;i<len;i++) {
			int temp=Character.getNumericValue(s.charAt(i));
			sum = (int) (sum+ Math.pow(temp, len));
		}
		if (num==sum) {
			System.out.println("Enter number is "
					+ "Armstrong Number ");
		}
		else
			System.out.println("Enter number is not Armstrong Number ");
	}
	public static void RemoveWhiteSpaces() {
		String s="this    is  ram   ";
//		String s1=s.replaceAll("\\s", "");
		char[] c=s.toCharArray();
		StringBuilder sb= new StringBuilder();
//		System.out.println(s1);
		for(char i:c) {
			if(!Character.isWhitespace(i)) {
				sb.append(i);
			}
		}
		System.out.println(sb);
	}
	
	public static void IntegerPalindrome() {
		Scanner s =new Scanner(System.in);
		int num;
		int rev=0;
		System.out.println("Enter the number");
		num=s.nextInt();
		int temp=num;
		int rem;
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+ rem;
			temp=temp/10;
		}
		if (num==rev) {
			System.out.println("Number is palindrome");
		}
		else
			System.out.println("Number is not palindrome");
	}
	
	public static void RemoveDuplicatesfromArrayList() {
		List<Integer> arr= new ArrayList<Integer>();
		arr.addAll(Arrays.asList(1,2,2,4,4,5,5,7,8));
		List<Integer> arr1=new ArrayList<Integer>();
		for(int i : arr) {
			if(!arr1.contains(i)) {
				arr1.add(i);
			}
		}
		System.out.println(arr1);
		
		
	}
	public static boolean isLeapYear(int year)
	{
		Calendar cal =Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		int day=cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		if (day!=365)
			return true;
		else
			return false;
		
	}

}