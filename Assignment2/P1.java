import java.util.Scanner;
class P1{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	System.out.print("enter no of row");
	
for(int i=1;i<=r;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j+" ");

}
System.out.println();
}
}

}