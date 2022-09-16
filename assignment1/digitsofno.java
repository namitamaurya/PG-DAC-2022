import java.util.Scanner;
class digitsofno{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter a no");
int num=sc.nextInt();

int b;
System.out.print("The digits are  ");
while(num>0)
{
b=num%10;
System.out.println(b);
num=num/10;

}
}
}