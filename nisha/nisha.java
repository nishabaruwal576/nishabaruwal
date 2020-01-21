import java.util.Scanner;
public class nisha
{       
    public static void main(String[] args)
    {
       int x, temp;
      Scanner sc= new Scanner (System.in);
      System.out.println("enter all the elements you want to sort");
      x = sc.nextInt();
      int a[]=new int[x];
      System.out.println("enter the all elements");
      for (int i=0; i<x;i++)
      {
          a[i] = sc.nextInt();
        }
        for (int i=0;i<x;i++)
        {
            for(int j=i+1; j<x; j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[1];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("ascending order");
        for (int i=0;i<x-1;i++)
        {
            System.out.print(a[i] +",");
        }
        System.out.print(a[x-1]);
    }
}