import java.util.Scanner;
class Palindromeno{
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
	System.out.print(" Enter a no ");
	int a=s.nextInt();
	int temp=a;
	int dig;
	int b=0;
	while(temp>0)
	{
		dig=temp%10;
		temp=temp/10;
		b=b*10+dig;
	}
	if(b==a)
	{
		System.out.print("No is palindrome ");
	}
	else
	{
		System.out.print("No is not palindrome ");
	}
	
	}
}