import java.util.Scanner;
class factors{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE VALUE OF NUM:");
	int a=sc.nextInt();      //lets take a= 153
	int sum=0,mul,flag,count=0,i;
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
		System.out.println("no is armstrong no");
	}
	else
	{
		System.out.println("no is not armstrong");
	}
	}
}
// Armstrong no is a no whose sum of digit's power to no of digits in the no itself is equal to the original no itself
//like 153 is original no. no of