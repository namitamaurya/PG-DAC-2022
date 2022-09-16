import java.util.Scanner;
class Hcforgcd{
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
	 Scanner t=new Scanner(System.in);
	System.out.print("Enter first no ");
	int a=s.nextInt();
	System.out.print("Enter second no ");
	int b=s.nextInt();
	int hcf=0;
	
    if(a==b)
	{
	System.out.println("Hcf is "+a);
	}
	else if(a<b)
	{
		for(int i=1;i<=a;i++)
		{
			if(a%i==0&&b%i==0)
			{ 
		     hcf=i;
			}
		}
		System.out.print("HCF is "+hcf);
		}
			else
	{
		for(int i=1;i<=b;i++)
		{
			if(b%i==0&&b%i==0)
			{
				hcf=i;
			}
		
		}
		System.out.print("HCF is "+hcf);
	}
	}
}