import java.util.*;
public class Age
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int age=sc.nextInt();
       if(age>=18)
       {
           System.out.println("Eligible to vote");
       }
           else{
               System.out.println("not eligible to vote");
           }
       }
	}