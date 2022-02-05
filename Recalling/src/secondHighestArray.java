
public class secondHighestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,3,8,10,19,22,35,1};
		SecondHighest(arr);
	}
	public static void SecondHighest(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		System.out.println("The second largest number is :" +arr[arr.length-2]);
		
		int highest=0;
		int secondHighest=0;
		for(int i:arr) {
			if(i>highest) {
				secondHighest=highest;
				highest=i;
			}
			else if(i>secondHighest)
				secondHighest=i;
		}
		System.out.println("The second largest number is :" +secondHighest);
	}

}
