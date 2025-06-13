import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		System.out.print("enter a number  :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%3==0 && n%5==0)
		{
		    System.out.println("FIZZBUZZ");
		}
		else if(n%3==0)
		{
		    System.out.println("FIZZ");
		}
		else{
		    System.out.println("BUZZ");
		}
		
	}
}
