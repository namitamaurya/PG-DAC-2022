import java.util.Scanner;
class P16{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
for(int i=r;i>=1;i--)
{
for(int j=r;j>=i;j--)
{
System.out.print(j+"  ");

}
System.out.println();
}
}

}

