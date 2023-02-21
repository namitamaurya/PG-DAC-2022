class Ques15
{
    public static void main(String args[])
    {
        int a=9876,rem=0;
        while(a>0)
        {
            rem=a%10;
            System.out.print(rem);
            a=a/10;
        }

    }
}