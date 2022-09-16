import java.util.Scanner;
class Primeno{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int a=num;
	int rem=0;
	if(a==1)
		System.out.print("no is not a prime") ;
	int b=a/2;       
	// for primecheck no is divided by 2,for ex no is 12 ,then we will check from 2 to 6 because 12 cant be divisible by no more than 6
	for(int c=2;c<=b;c++)
	{
	rem=a%c;
	}
	if(rem==0){
		System.out.println("no is not prime");
	}
	else
	{
		System.out.println( "no is  prime");
	}
	}
}