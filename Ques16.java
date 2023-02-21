class Ques16
{
    public static void main(String args[])
    {
        int a=20,b=30;
       if(a>b)
       {
        int c=a/2;
        for(int i=c;i>0;i--)
        {
            if(a%i==0&&b%i==0)
            {
                System.out.print("Gcd is"+i);
                break;
            }
        }
        
       }
      if(b>a)
       {
        int c=b/2;
         for(int i=c;i>0;i--)
        {
        
            if(b%i==0&&a%i==0)
            {
                System.out.print("Gcd is"+i);
                break;
            }
        }
       }
        
    }
}