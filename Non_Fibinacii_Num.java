package List;
import java.util.Stack;
import java.util.*;
public class Non_Fibinacii_Num
{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
	    Stack<Integer>s=new Stack<>();
	        int a=0;
	        int b=1;
	        while (a<=25) 
	        {
	        	s.push(a);
	        	int temp=a;
	            a=b;
	            b = temp+b;
	        }
	        System.out.println("Non-Fibonacci numbers between 0 and 25:");
	        for (int i=0;i<=25;i++)
	        {
	        	if (!s.contains(i)) 
	            {
	        	    System.out.print(i+" ");
	            }
	        }
	    }
	}