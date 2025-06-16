import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a number");
 int n=sc.nextInt();
 if(n%3==0 && n%5==0)
 {
     System.out.println("FIZZ BUZZ");
 }
 else if(n%3==0)
 {
     System.out.println("FIZZ");
 }
 else if(n%5==0)
 {
 System.out.println("BUZZ");
  }
  else
  {
      System.out.println("BUZZ FIZZ");
  }
  }
}
