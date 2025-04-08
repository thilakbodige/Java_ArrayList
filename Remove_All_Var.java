package List;
import java.util.ArrayList;
public class Remove_All_Var 
{
  public static void main(String[] args)
   {
	ArrayList<Integer> a=new ArrayList<>();
	     a.add(1);
	     a.add(3);
	     a.add(5);
	     a.add(1);
	     a.add(3);
	     a.add(2);
	     a.add(3);
	     a.add(4);
	     a.add(2);
	  System.out.println("a : " + a);
	ArrayList<Integer> a1=new ArrayList<>();
	     a1.add(1);
	     a1.add(2);
		 a1.add(3);
	  System.out.println("a1 : " + a1);
		 a.removeAll(a1);
	  System.out.println("a : " + a);
	}

}
