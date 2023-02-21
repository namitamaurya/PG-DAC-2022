import java.util.Scanner;
class Ques2
{
 public static void main(String args[])
 {
     System.out.print("Enter a number");
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int fact=1;
 for(int i=a;i>0;i--)
 {
 fact=fact*i;
 }
 System.out.print("factorial is  "+fact);
 
 }
}