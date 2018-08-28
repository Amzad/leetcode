package q1;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 		 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
		 * Given nums = [2, 7, 11, 15], target = 9,
		 * Because nums[0] + nums[1] = 2 + 7 = 9,
		 * return [0, 1].
		**/
		int nums[] = {1,2,3,4};
		int target = 7;
		int a[] = twoSum(nums, target);
		System.out.println(a[0] + " " + a[1]);
		
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
        	int index = 0;
        	for (int j = i + 1; j < length; j++) {
        		if (nums[i] + nums[j] == target) { 
        			int targets[] = {nums[i], nums[j]};
        			return targets;
        		}
        	}
        }
		
		return null;
    }
}
