package com.tn.qa.pages;

public class MergeSort {

	public static void main(String[] args) {
		int[] nums = {5,2,8,3,1,6};
System.out.println("original array");
		printArray(nums);
		
		mergeSort(nums, 0, nums.length - 1);
		System.out.println("sorted array");
		printArray(nums);
	}

	public static void mergeSort(int[] nums, int left, int right) {
		if(left < right) {
			int mid = left + (right - left) /2;
			
			mergeSort (nums, left, mid);
			mergeSort (nums, mid +1, right);
			merge(nums, left, mid, right);
		}
	}
			
			 public static void merge(int[] nums, int left, int mid, int right) {
			        int n1 = mid - left + 1;
			        int n2 = right - mid;
			        
			        int[] leftArray = new int[n1];
			        int[] rightArray = new int[n2];
			        
			        for (int i = 0; i < n1; i++) {
			            leftArray[i] = nums[left + i];
			        }
			        
			        for (int j = 0; j < n2; j++) {
			            rightArray[j] = nums[mid + 1 + j];
			        }
			        
			        int i = 0, j = 0, k = left;

			        while (i < n1 && j < n2) {
			            if (leftArray[i] <= rightArray[j]) {
			                nums[k] = leftArray[i];
			                i++;
			            } else {
			                nums[k] = rightArray[j];
			                j++;
			            }
			            k++;
			        }
			        
			        while (i < n1) {
			            nums[k] = leftArray[i];
			            i++;
			            k++;
			        }
			        
			        while (j < n2) {
			            nums[k] = rightArray[j];
			            j++;
			            k++;
			        }
			    }
			    
			    public static void printArray(int[] nums) {
			        for (int num : nums) {
			            System.out.print(num + " ");
			        }
			        System.out.println();

		}
	}
	
	

