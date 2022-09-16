import java.util.Scanner;
class sumofdigits{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	System.out.print("enter a no ");
	int num=sc.nextInt();
	int b,sum=0;
	while(num>0)
	{
		b=num%10;
		sum=sum+b;
		num=num/10;
		
	}
	System.out.println("sum of digits of the no is "+sum);
}
}