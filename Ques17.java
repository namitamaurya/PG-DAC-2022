class Ques17
{
    public static void main(String args[])
    {
        int a=20,b=30,gcd=0;
       if(a>b)
       {
    
        for( int i=1;i<a;i++)
        {
            if(a%i==0&&b%i==0)
            {
                gcd=i;
            }
        }
        
       }
      if(b>a)
       {
       
         for(int i=1;i<b;i++)
        {
        
            if(b%i==0&&a%i==0)
            {
                 gcd=i;
            }
        }
       }
       int d=(a*b)/gcd;
        System.out.print("LCM of two numbers is"+d);
    }
}