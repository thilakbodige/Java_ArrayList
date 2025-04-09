package List;
import java.util.ArrayList;
import java.util.Iterator;

public class Vowel_Character_ArrayList 
{
    public static void main(String[] args)
    {
     ArrayList<Character> a = new ArrayList<>();
        a.add('S');
        a.add('a');
        a.add('i');
        a.add('T');
        a.add('i');
        a.add('l');
        a.add('a');
        a.add('k');
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');

      System.out.println("Original List: " + a);
        removeVowels(a);
       System.out.println("List After Removing Vowels: " + a);
    }

    public static void removeVowels(ArrayList<Character> a)
    {
        Iterator<Character> a1 = a.iterator();
        while (a1.hasNext())
        {
            Character ch = a1.next();
            if (isVowel(ch))
            {
                a1.remove();
            }
        }
    }

    public static boolean isVowel(char ch)
    {
           char c = ch;
        if (ch >= 'A' && ch <= 'Z') 
        {
           c = (char) (ch + 32);
        }
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}




//public class Remove_Vowel 
//{
   //public static void main(String[] args) 
	//{
        //ArrayList<Character> s1 = new ArrayList<>();
		//Scanner sc = new Scanner(System.in);
		//String ans;
		//do{
		//System.out.println("Enter the Alphabet");
        //char s=sc.next().charAt(0);
        //s1.add(s);
        
        //System.out.println("Do you want to Enter one more alphabet");
         //ans =sc.next();
		//}while(ans.equalsIgnoreCase("yes"));
		//System.out.println("Before remove Vowel:"+s1);
		
		//ArrayList<Character>s2=new ArrayList<>();
		//s2.add('a');
		//s2.add('e');
		//s2.add('i');
		//s2.add('o');
		//s2.add('u');
		//s1.removeAll(s2);
		//System.out.println(s1);
		//}
//}












