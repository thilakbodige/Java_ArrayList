package List;
import java.util.ArrayList;
import java.util.Iterator;
public class Next_Method 
{
	public static void main(String[] args)
	{
	ArrayList<Integer>a1=new ArrayList<>();
	a1.add(1);
	a1.add(2);
	a1.add(3);
	Iterator<Integer>i=a1.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}