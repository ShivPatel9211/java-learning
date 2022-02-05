package com.array;

public class ElementFrequency {
	public static void main(String[] args) {
		int[] arr= {1,3,5,6,3,6,4,6};
		ArrayFrequency(arr);
		
	}
	public static void ArrayFrequency(int[] arr)
	{
		int arr1[]=new int[arr.length];
		for (int i=0;i<arr.length;i++) 
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			arr1[i]=count;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+":"+arr1[k]+" ");
		}
	}
}
