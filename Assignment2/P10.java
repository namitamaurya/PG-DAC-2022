import java.util.Scanner;
class P10{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter no of row ");
	int r=sc.nextInt();
	
char x='E';
for(int i=r;i>=1;i--)
{

for(int j=1;j<=(i-1);j++)
{	
System.out.print(" ");
}
for(int j=i;j<=r;j++)
{
System.out.print(x+" ");
x--;
}
System.out.println();
}
}

}