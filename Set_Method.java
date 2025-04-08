package List;
import java.util.ArrayList;
public class Set_Method 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(5);
		a.add(72);
		a.add(97);
		a.add(32);
		System.out.println(a);
   for(int i=0;i<a.size();i++)
   {
	   int n=a.get(i);
	   if(n%2==0)
	   {
		   a.set(i,0);
	   }
   }
   System.out.println(a);
	}

}
