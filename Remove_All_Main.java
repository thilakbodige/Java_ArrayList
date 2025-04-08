package List;
import java.util.ArrayList;
public class Remove_All_Main 
{
	public static void main(String[] args)
	{
	 ArrayList<Integer> a=new ArrayList<>();
	 a.add(10);
	 a.add(20);
	 a.add(30);
	 a.add(40);
	 ArrayList<Integer> a1=new ArrayList<>();
	 a1.add(1);
	 a1.add(2);
	 a1.add(3);
	 a1.add(4);
	 a.addAll(2,a1);
	 System.out.println(a);
	 a.removeAll(a1);
	 System.out.println(a);
	 a.add(0,1);
	 a.add(2,2);
	 a.add(4,3);
	 a.add(6,4);
	 System.out.println(a);
	 a.removeAll(a1);
	 System.out.println(a);
	}

}
