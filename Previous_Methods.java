package List;
import java.util.*;
public class Previous_Methods
{
	public static void main(String[] args)
	{
		ArrayList<Integer>a1=new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		ListIterator<Integer>li=a1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("---------------");
        while(li.hasPrevious())
        {
        	System.out.println(li.previous());
        }
	}
}