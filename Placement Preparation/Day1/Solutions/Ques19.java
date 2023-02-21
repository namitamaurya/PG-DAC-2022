class Ques19
{
    public static void main(String args[])
    {
        int num=1031,rem=0,rev=0;
        int a=num;
        while(a>0)
        {
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        if(rev==num)
        {
            System.out.print("no is palindrome");
        }
        else 
        {
            System.out.print("no is not palindrome");
        }
    }
}