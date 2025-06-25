import java.util.*;
public class Fibonacci
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int range=sc.nextInt();
		int a,b,c;
		a=-1;
		b=1;
		for(int i=1;i<=range;i++)
		{
		    c=a+b;
		    System.out.println(c+" ");
		    a=b;
		    b=c;
		}
	}
}











