import java.util.Scanner;
class P2{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	System.out.print("enter no of row ");
	System.out.println(" ");
for(int i=1;i<=r;i++)
{
	char x='A';
for(int j=1;j<=i;j++)
{
	
System.out.print(x+" ");
x++;

}
System.out.println();
}
}

}