import java.util.Scanner;
class Ques26
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int sum=0;
     for(int j=1;j<a;j++)
     {
     for(int i=1;i<j;i++)
     {
        if(j%i==0)
        {
            sum=sum+i;
        }

     }
     if(sum==j)
     {
        System.out.print(sum);
     }
     }
     
    }
}