import java.util.Scanner;
class Pyramid2{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter no of row ");
	int r=sc.nextInt();
	

for(int i=1;i<r;i++)
{
	
for(int j=1;j<=(r-i);j++)
{	
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}

}