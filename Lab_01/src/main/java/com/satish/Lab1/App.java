 package com.satish.Lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]=	 new int[] {-1, 0, 1, 2, -1, -4};
		int result1[][] = new int[2][];
		for ( int FirstNumber :nums) {
			int target = -(FirstNumber);
			List<Integer> result= twoSum(nums, target);
			System.out.println(result);
			break;
			}
		}
	 public static List<Integer> twoSum(int[] nums, int target) {
		 
		 List<Integer> list= new ArrayList<>(); 
		 Arrays.sort(nums);
	        int a_pointer = 0;
	        int Sum;
	        int b_pointer = nums.length-1;   
	    while (b_pointer >= a_pointer ){
	        Sum = nums[a_pointer]+nums[b_pointer];
	        if ( Sum > target ){
	        b_pointer -= 1;
	        }else if(Sum < target ){
	        a_pointer += 1 ;
	        }else if ( Sum == target) {
	        	
	        	list.add(nums[a_pointer]);
	        	list.add(nums[b_pointer]);
	        	
	            return list;
	        }
	    }
	        throw new IllegalArgumentException("No Match Found");
		 
		 
	    }
}