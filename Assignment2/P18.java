import java.util.Scanner;
class P18{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
for(int i=1;i<=r;i++)
{
	char x='A';
	
for(int j=5;j>=i;j--)
{
System.out.print(x+"  ");
x++;

}
System.out.println();
}
}

}

