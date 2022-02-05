
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,2,6,9,5};
		int[] arr2=Sort(arr);
		for(int i:arr2) {
			System.out.print(i+" ");
		}

	}
	public static int[] Sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
