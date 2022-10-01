import java.util.Scanner;
class practice
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a>=10000)
	{
     int hra=2000;
	 int da =(98/100)*a;
	 int gs=a+hra+da;
     System.out.println("Gross salary = "+ gs);
	}
	else
	{
     int hra =(10/100)*a;
	 int da=(90/100)*a;
	 int gs=a+hra+da;
	 System.out.println("Gross salary = "+ gs);
	}
}

}
