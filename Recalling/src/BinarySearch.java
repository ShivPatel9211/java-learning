
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,5,7,8,10};
		int key=8;
		 int i=Serach(arr, key);
		 if (i==-1)
			 System.out.println("Sorry search element is not present");
		 else
			 System.out.println("Serach element found at index : "+i);

	}
	public static int Serach(int[] arr, int key) {
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		while(low<=high) {
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else if (arr[mid]>key) {
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		return -1;
	}

}
