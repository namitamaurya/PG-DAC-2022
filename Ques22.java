import java.util.Scanner;
class Ques22
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
    
       for(int i=1;i<=n;i++)
       {
        for(int j=2;j<=i/2;j++)
        {
            count=0;
            if(i%j==0)
            {
                count++;
                break;
            }
           
        }
        if(count==0&&n!=1)
        {
             System.out.print(i);
             
        }
       }
       
    }
}