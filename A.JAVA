import java.util.Scanner;


public class A
{
	public static void main(String[] arr)
	{
		
		Scanner value=new Scanner( System.in);
		System.out.println("enter the value :");
		int a=value.nextInt();
		if(a<0)
		System.out.println("Negative number:");
		else if(a==0)
		System.out.println("Zero value");
		else
			System.out.println("Positive value");
		
		
		
	}

}
