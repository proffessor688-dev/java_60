import java.util.*;

 class ArrayUtils{
	 public static void Reverse( char arr[]){
		int start=0;
		int end=arr.length-1;
		while(start<end){
		char temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
		start++;
		end--;
		}
	 }
 }
 public class ReverseString{
	public static void main(String args[]){
	   String str="HELLO";
	   char arr[]=str.toCharArray();
	   ArrayUtils.Reverse(arr);
	   for(char val:arr){
		   System.out.println(val + " ");
	   }
	}
 }