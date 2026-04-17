import java.util.*;
 class MathsUtility{
	public static int checkPallindrome(int num){
		int rev=0;
		while(num!=0){
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10 ;
		}
		return rev;
	}
 }
 public class Pallindrome{
	 public static void main(String args[]){
	  Scanner input=new Scanner(System.in);
	    
    	System.out.println("Enter the value :");
        int num=input.nextInt();
        int rev=MathsUtility.checkPallindrome(num);
		if(num==rev){
		 System.out.println(num +"is a Palindrome");
		}else{
			System.out.println(num + " is not a palindrome");
		}
        		
	 }
 }
