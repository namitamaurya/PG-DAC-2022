class Ques21
{
    public static void main(String args[])
    {
        int a=7;
        boolean b=false;
        for(int i=2;i<a/2;i++)
        {
          if(a%i==0)
          {
           b=true;
           break;

          }
        }
        if(b!=false)
        {
            System.out.print("no is not prime");

        }
        else{
      System.out.print("no is  prime");
        }
    }
}