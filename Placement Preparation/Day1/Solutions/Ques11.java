import java.util.Scanner;
class Ques11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a/2;
        System.out.print("factors of no are");
        for(int i=1;i<=b;i++)
        {
            if(a%i==0)
            {
              
                System.out.print(i+" ");
            }
        }
         System.out.print(a);

    }
}