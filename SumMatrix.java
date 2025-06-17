import java.util.*;
public class SumMatrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rowsandcolumns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enetr matrix elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            a[r][c]=sc.nextInt();
        }
    }
    int sum=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            sum=sum+a[i][j];
        }
    }
    System.out.println("matrix elements are");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            System.out.println(a[i][j]);
        }
        System.out.println();
    }
}
}