package Assignment1;
import java.util.*;
public class First {
	
	public static void main(String args[])
	{
		int a,b,c;
		First f = new First();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		a = sc.nextInt();
		System.out.println("Please enter second number");
		b = sc.nextInt();
		
		c = f.Add(a, b);
		System.out.println("Addition of the given numbers is: "+c);
	}
	
	int Add(int x, int y)
	{ 
	    while (y != 0)
	    {
	        int carry = x & y;  
	        x = x ^ y; 
	        y = carry << 1;
	    }
	    return x;
	}
}
