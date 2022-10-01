import java.util.Scanner;
class swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First no");
int a=sc.nextInt();
Scanner so=new Scanner(System.in);
System.out.println("Enter second no");
int b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;

System.out.println("a= "+ a);
System.out.println("b= "+ b);



}


}
