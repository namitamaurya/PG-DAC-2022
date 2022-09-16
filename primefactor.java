import java.util.Scanner;

class primefactor
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Positive No.");
		int a=s.nextInt();
		
		for(int i=2;i<a;i++)  //2,3,4,5......a=60..30..15..5
		{
			while(a%i==0)     //0..
			{
				System.out.println(i);//2..2...3
				a=a/i; //30..15..5
			}
		}
		
		if(a>2)
		System.out.println(a);	//5
	
	}
	
}	


/*
1.No.=12--->a.........1,2,3,4,6,12
14.....1,2,7,14.....8,9,10,11,12,13
2.n=a/2
3.loop....i=1......n
4.check for a%i==0... 



12
1,2,3,4,5,6,7,8,9,10,11,12
* * * *   *             *

16
1,2,3,4,5,6,7,8,9,10,11,12
* *   *       *         


*/