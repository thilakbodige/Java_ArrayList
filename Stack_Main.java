package List;
import java.util.Stack;
public class Stack_Main 
{
	public static void main(String[] args)
	{
	Stack<Integer> s=new Stack<>();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	for(int i=0;i<s.size();i++)
	{
		System.out.println(s.get(i));
	}

	}
}
