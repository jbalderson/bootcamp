package com.tn.qa.pages;

public class MaxSubarraySum {

	public static void main(String[] args) {
		int[]nums = {-2,-3,-4,-1,-2,1,5,-3};
		
		int maxSum =
				findMaxSubarraySum(nums);
		System.out.println("Maximum subarray sum: " + maxSum);
	}
	
	public static int findMaxSubarraySum(int[] nums) {
			int maxSoFar = nums[0];
			int maxEndingHere = nums [0];
			
			for (int i =1; i < nums.length; i++) {
				maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
				maxSoFar = Math.max(maxSoFar, maxEndingHere);
			}

			return maxSoFar;
		
	}

}
