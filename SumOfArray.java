	import java.util.*;
public class SumOfArray
{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
       int n=sc.nextInt();
       int[] a=new int[n];
       System.out.println("enter the "+n+" elements");
      for(int i=0;i<a.length;i++)
      {
          a[i]=sc.nextInt();
      }
      int sum=0;
      for(int i=0;i<a.length;i++)
      {
         sum+=a[i];
      }
          {
               System.out.println("sum of array elements are "+sum);
          }
         
      
    }
}












