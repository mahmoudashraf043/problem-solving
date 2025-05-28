package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//https://leetcode.com/problems/container-with-most-water/submissions/1639349021/?envType=problem-list-v2&envId=array   problem link
public class main {

	    public int maxArea(int[] height) {
	        int head = 0;
	        int tail = height.length-1;
	        int max = 0 , temp;

	        while(head < tail){
	            temp=0;
	            if(height[head] <= height[tail]){
	                temp = (tail-head) * (height[head]);
	                head++;
	            }
	            else{
	                temp = (tail-head) * (height[tail]);
	                tail--;
	            }
	            
	            if(temp > max){
	                max = temp;
	            }


	        }
	    return max;

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		main m = new main();
		int[] arr = {1,8,6,2,5,4,8,3,7};
		int result = m.maxArea(arr);
		System.out.println(result);

	}

}
