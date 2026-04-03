import java.util.*;

 class MathsUtils{
	public static int[] getMinMax(int[] nums){
		
	if(nums.length == 0){
        throw new IllegalArgumentException("Array is empty");
    }
	int max=nums[0];
	int min=nums[0];
	

    for(int i=1;i<nums.length;i++){
			if(nums[i]>max){
			 max=nums[i];
			}
			if(nums[i]<min){
			 min=nums[i];	
			}	
		}
		return new int[]{min,max};
	}  
}
    public class MinMax{
	  public static void main(String args[]){
	  int nums[]={5,78,45,25,36,6,98};
	  int[] results = MathsUtils.getMinMax(nums); 
      for(int num:results){
		System.out.println(num + " ");
	  }	  
    }
 }