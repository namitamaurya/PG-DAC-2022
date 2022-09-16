import java.util.Scanner;
class P17{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int count=1;
for(int i=1;i<=r;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(count+" ");
count++;
}
System.out.println();
}
System.out.print(count++);
}

}

