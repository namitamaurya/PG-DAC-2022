import java.util.Scanner;
class Factorial{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	System.out.print( "Enter a no ");
	int num=sc.nextInt();
	int b;
	int fact=1;
    for(int b=num;b>0;b--)
	{
		fact=fact*b;
	}
	System.out.println("Factorial is "+fact);
}
}