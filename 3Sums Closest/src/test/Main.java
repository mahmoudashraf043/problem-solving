package test;

import java.util.Arrays;

public class Main {
	
	public int threeSumClosest(int[] nums, int target) {
		int sum = 0;
		int result = Integer.MAX_VALUE / 2;
	
		
		Arrays.sort(nums);
		if(nums.length > 2) {

			for(int i=0 ; i<nums.length-2 ; i++) {
				int left = i+1;
				int right = nums.length - 1;
				if (i > 0 && nums[i] == nums[i - 1]) {
	                continue;
	            }
				
				while(left < right ) {
					sum = nums[i] + nums[left] + nums[right];
					if(Math.abs(target - sum) < Math.abs(target - result) ) {
						result = sum;
					}
					
					if(sum > target) {
						right--;
					}
					else if(sum < target) {
						left++;
					}
					else {
						return sum;
					}
				}
			}
		}
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {0,0,0};		
		Main m1 = new Main();
		System.out.println(m1.threeSumClosest(nums, 0));
	}

}
