class Ques12
{
public static void main(String args[])
{
    int a=9875;
    int sum=0;
    while(a>0)
    {
     int b=a%10;
    sum=sum+b;
     a=a/10;
    }
    System.out.print(sum);
}

}