import java.util.Scanner;
class Ques24
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
	
	int num=sc.nextInt();      
	int sum=0,mul,flag,count=0,i;
    for(int a=1;a<=num;a++)
    {
	int temp=a;
	while(temp>0)
	{
		temp=temp/10;       //15..1..0
		count++;            //1...2..3       3 times loop will run
	}
	temp=a;                  //temp=153
	while(temp>0)
	{
		mul=temp%10;          //   3..5..1
		temp=temp/10;          //15..1..0
		flag=1;
	for(i=count;i>=1;i--)
	{
	flag=flag*mul;             //loop will run 3 times...flag=27...125...1
	}
	sum=sum+flag;               //sum=27...152...153
	}
	if(sum==a)
	{
		System.out.println(i);
	}
	
	}
 }
}