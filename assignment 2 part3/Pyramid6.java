import java.util.Scanner;
class Pyramid6{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter no of row ");
	int r=sc.nextInt();

	
for(int i=1;i<=r;i++)
{
for(int j=i;j>1;j--)
{
System.out.print(" ");

}
for(int j=1;j<=(r-i+1);j++)
{
	System.out.print("*"+" ");
}
System.out.println();
}
}

}