import java.util.*;
 class ArrayUtils{
	 public void reverse(int[] nums){
		 int start=0;
		 int end =nums.length-1;
		 
		while(start<end){
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			
			start++;
			end--;
		}
	}
 }
  public class arrayReverse{
	  public static void main(String args[]){
		int nums[]={1,2,3,4,5};
		ArrayUtils obj=new ArrayUtils();
		obj.reverse(nums);
		
		System.out.println("Reversed Array");
		for(int num:nums){
			System.out.println(num + " ");
		}
	}
	
 }
 
 
