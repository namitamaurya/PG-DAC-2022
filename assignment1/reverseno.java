import java.util.Scanner;
class reverseno{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter a no");
int num=sc.nextInt();
int b;
while(num>0)
{
b=num%10;
System.out.print(b);
num=num/10;

}
}
}