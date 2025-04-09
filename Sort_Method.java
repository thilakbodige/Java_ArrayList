package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_Method 
{
	public static void main(String[] args)
	{
		List<Integer> li=new ArrayList<Integer>();
		li.add(210);
		li.add(22);
		li.add(-23);
		li.add(124);
	    System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
	}

}
