package List;
import java.util.ArrayList;
public class Get_Method 
{
public static void main(String[] args) 
	{
	ArrayList<Integer> a=new ArrayList<>();
	a.add(5);
	a.add(7);
	a.add(97);
	a.add(32);
	System.out.println(a);
	for(int i=0;i<a.size();i++)
	{
		System.out.println(a.get(i));
	}

	}
}
