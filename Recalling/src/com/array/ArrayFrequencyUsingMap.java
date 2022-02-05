package com.array;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequencyUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,6,3,6,4,6};
		ArrayFrequency(arr);
	}
	public static void ArrayFrequency(int[] arr) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int count=1;
			int num=arr[i];
//			System.out.println(num);
			if(map.containsKey(num)) {
				count=map.get(num);
				count++;
				map.replace(num, count);
			}
			else {
				map.put(num, count);
			}
		}
		System.out.println(map);
	}
}
