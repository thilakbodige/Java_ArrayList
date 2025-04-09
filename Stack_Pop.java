package List;
import java.util.Stack;
public class Stack_Pop 
{
	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		s.push(70);
		System.out.println(s);
		}

	}
