import java.util.Scanner;
class smallest{
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
	Scanner o=new Scanner(System.in);
	Scanner t=new Scanner(System.in);
	int a=s.nextInt();
	int b=o.nextInt();
	int c=t.nextInt();
	if(a<b&&a<c)
	{
		System.out.print( a+" is the smallest no");
		
	}
	else if(b<c)
	{
		System.out.print(b+" is smallest no");
		
	}
	else{
		System.out.print(c+" is the smallest no  ");
		
	}
	
}
}