package List;
import java.util.LinkedList;
import java.util.Collections;
public class Reverse_LinkedList
{
	public static void main(String[] args) 
    {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);
        System.out.println(li);
        Collections.reverse(li);
        System.out.println(li);
    }
}
