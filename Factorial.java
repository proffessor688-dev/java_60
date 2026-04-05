import java.util.*;

 class MathsUtilts{
	public static int getFactorial(int num){
		
	  if(num==0 ||num==1){
		  return 1;
       } 
		return num*getFactorial(num-1);
	}
 }
 public class Factorial{
	public static void main(String args[]){
		int res=MathsUtilts.getFactorial(5);
		System.out.println(res +" ");
		
	}
 }