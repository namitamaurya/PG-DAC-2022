import java.util.Scanner;
class si
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Principle");
int a=sc.nextInt();
System.out.println("Enter rate");
int b=sc.nextInt();
System.out.println("Enter time");
int c=sc.nextInt();
int d=(a*b*c)/100;
System.out.println("S.I ="+ d);

}


}
