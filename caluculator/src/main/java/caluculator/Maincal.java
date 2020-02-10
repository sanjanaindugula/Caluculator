package caluculator;
import java.util.*;

public class Maincal {
public static void main(String [] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("*****SIMPLE CALCULATOR******");
	System.out.println("Enter the Number a: ");
	int a=s.nextInt();
	System.out.println("Enter the Number b: ");
	int b=s.nextInt();
	System.out.println("Enter operator: ");
	Add add=new Add();
	System.out.println("1. Addition");
	Sub sub=new Sub();
	System.out.println("2. Subtract Second number from first number.");
	Mul mul=new Mul();
	System.out.println("3. Multiplication");
	Div div=new Div();
	System.out.println("4. Divide First number with second number.");
	int k=s.nextInt();
	int value;
	if(k==1)
	{
		value=add.cal(a,b);
		System.out.println("Sum of first number and second number is: "+value);
	}
	else if(k==2)
	{
		value=sub.cal(a,b);
		System.out.println("Difference between first number and second number is: "+value);
	}
		
	else if(k==3)
	{
		value=mul.cal(a,b);
		System.out.println("product of first number and second number is: "+value);
	}
	else if(k==4)
	{
		value=div.cal(a,b);
		System.out.println("Quotient when first number is divided by second number is: "+value);
	}
	s.close();
}
}
