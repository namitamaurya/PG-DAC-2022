import java.util.Scanner;
class Ques3
{
 public static void main(String args[])
 {
     System.out.print("Enter a number");
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();

 System.out.print(factorial(a));

 }
 static int factorial(int a)
 {
    if (a==1)
    return 1;
    else
    return a*factorial(a-1);
    
 }

}