package List;
import java.util.Scanner;
import java.util.Stack;
public class Ordered_Unordered
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string of brackets: ");
	    if (sc.hasNext())
		{
		  String s = sc.next();
		   if (isOrdered(s))
		    {
		     System.out.println("The string \"" + s + "\" is ordered.");
		    } 
		     else
		    {
		      System.out.println("The string \"" + s + "\" is unordered.");
		    }
		}
	}
	public static boolean isOrdered(String s) 
	{
		Stack<Character> stack = new Stack<>();
		String bracketChars = "(){}[]";
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
		    if (bracketChars.contains(String.valueOf(ch)))
		    {
		     if (ch=='('||ch=='{'||ch=='[') 
		    {
		     stack.push(ch);
		    } 
		     else if (ch==')'||ch=='}'||ch==']')
		    {
		     if (stack.isEmpty())
		    {
		     return false; 
		    }
		     char c = stack.pop();
		     if ((ch==')'&& c!='(')||(ch=='}'&&c!='{')||(ch==']'&&c!='[')) 
		    {
		     return false; 
		    }
		    }
		    }
        }
		    return stack.isEmpty(); 
	 }
}