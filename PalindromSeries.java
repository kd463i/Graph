import java.util.*;
public class PalindromSeries
{
	public static boolean ispalindrome(int num) {
	     int rev=0;
	     int org=num;
	    // int rev;
	     while(num!=0)
	     {
	         int rem=num%10;
	          rev=rev*10+rem;
              num/=10;
	     }
	     return org==rev;
	}
//}
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int num=sc.nextInt();
    System.out.println("enter the starting number");
    int start=sc.nextInt();
    System.out.println("emter the ending number");
    int end=sc.nextInt();
    System.out.println("palindrome numbers between "+start+" to "+end+" are");
    for(int i=start;i<=end;i++)
    {
        if(ispalindrome(i))
        {
            System.out.println(i+" ");
        }
    }
}   
}