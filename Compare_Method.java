package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare_Method
{
	public static void main(String[] args)
	{
		List<Integer> li=new ArrayList<Integer>();
		li.add(21);
		li.add(22);
		li.add(23);
		li.add(24);
	    System.out.println(li);
		System.out.println(li.get(2).compareTo(23));
		System.out.println(li.get(2).compareTo(10));
		System.out.println(li.get(2).compareTo(100));
	}


}
