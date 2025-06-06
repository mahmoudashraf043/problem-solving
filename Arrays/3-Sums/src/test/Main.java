package test;

import java.util.Arrays;
import java.util.*;

public class Main {

	 public List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> result = new ArrayList<>();
			Arrays.sort(nums);
			
			if(nums.length > 2) {
				for(int i = 0 ; i<nums.length -2 ; i++) {
					int left = i+1;
					int right = nums.length - 1;
					if (i > 0 && nums[i] == nums[i - 1]) {
		                continue;
		            }
					
					while(left < right) {
						if(nums[i] + nums[left] + nums[right] == 0) {
							// Found a triplet with zero sum
		                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
		                    
		                    // Skip duplicate elements for left
		                    while (left < right && nums[left] == nums[left + 1]) {
		                        left++;
		                    }

		                    // Skip duplicate elements for right
		                    while (left < right && nums[right] == nums[right - 1]) {
		                    	right--;
		                    }
		                    
		                    left++;
		                    right--;
						}
						else if(nums[i] + nums[left] + nums[right] > 0) {
							right--;
							
						}
						else if(nums[i] + nums[left] + nums[right] < 0) {
							left++;
						}
					}
					
				}
				
			}
			return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,2,-1,-4};
 		Main m1 = new Main();
		m1.threeSum(nums);
	}

}
