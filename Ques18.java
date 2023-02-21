import java.util.Scanner;
    class Ques18
    {
	 public static void main(String args[])
     {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number a = ");
	     int a=sc.nextInt();
	     System.out.println("Enter Number b = ");
	     int b=sc.nextInt();
		 int lcm=1;
		 int i=1,common=1,c=1;
		 
		 if(a>b)
		 {
		     c=a;
		 }
		 else
		 {                                                      // 36  1*36 ,2*18,3*12,4*9,6*6,9*4,12*3,18*2,36*1
		    c=b;
		 }
		 //                                               a=12  b=48
		 for(i=2;i*i<=c;i++)                  //2          a=6  b=24     
		    {
			    while(a % i == 0 && b % i == 0) // 1           1 
			    {
			        a=a/i;                   //6             3        1
			        b=b/i;                   //24             12      4
			        common=common*i;          //2             4        12
			        c=c/i;                    //24             12      4
			    }
			}
			     lcm=common*a*b;              //12*1*4=48
				 System.out.println("LCM of two numbers is equal to  "+lcm);
		}
}		