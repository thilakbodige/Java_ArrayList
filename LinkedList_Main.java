package List;
import java.util.LinkedList;
public class LinkedList_Main
{
	public static void main(String[] args)
	{
		LinkedList<Integer>li=new LinkedList<>();
	    li.add(10);
	    li.add(20);
	    li.add(30);
	    li.add(40);
	    System.out.println(li);
	    li.remove(Integer.valueOf(20));
	    System.out.println(li);

	}

}
