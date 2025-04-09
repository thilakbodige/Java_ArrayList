package List;

import java.util.ArrayList;
public class Generic
{
public static void main(String[] args) 
	{
		ArrayList<Object> a=new ArrayList<>();//generic
        a.add(new Demo());
        a.add(new Demi());
        a.add(new Generic());
        System.out.println(a);
		ArrayList<Demo>a1=new ArrayList<>();//specific
		a1.add(new Demo());
		//a1.add(new Demi());//(NOT POSSIBLE)
	}
}
  class Demo
  {
	  
  }
  class Demi
  {
	  
  }  
