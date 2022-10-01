import java.util.Scanner;
class temperature
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Temperature in Fahrenheit");
int a=sc.nextInt();
int b=5*(a-32)/9;

System.out.println("temperature in celsius" + b);



}


}
