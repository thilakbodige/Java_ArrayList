package List;
import java.util.Stack;
public class Stack_Empty
{
	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<>();
		System.out.println(s.empty());
	    s.add(50);
	    s.add(60);
	    s.add(70);
	    s.add(80);
	    System.out.println(s);
	    System.out.println(s.empty());
	    System.out.println(s.search(60));
	}

}
