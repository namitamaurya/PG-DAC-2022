import java.util.Scanner;
class factors{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	System.out.print(" Enter a no ");
	int num=sc.nextInt();
	int a=num;
	int n=1;
	int count=0;
	if(a<=0)
	{
		System.out.print("Enter a no greater than zero") ;
}
else
{
	 while(n<=a)
	{
	
	if(a%n==0)
		System.out.println(n);
		n++;
	
	
	}
}
	}
}