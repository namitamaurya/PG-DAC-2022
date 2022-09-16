import java.util.Scanner;
class P1{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter no of row ");
	int r=sc.nextInt();
	
for(int i=1;i<=r;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");

}
System.out.println();
}
}

}