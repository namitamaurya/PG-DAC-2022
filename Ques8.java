import java.util.Scanner;
class Ques8
{
 public static void main(String args[])
 {
     System.out.print("Enter a number");
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
if((a%4==0) &&(a%400==0)||(a%100!=0))
 System.out.print("Number is leap");
else
 System.out.print("Number is not leap");
}
}