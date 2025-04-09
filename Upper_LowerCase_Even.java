package List;
import java.util.ArrayList;
public class Upper_LowerCase_Even 
{
    public static void main(String[] args) 
    {
        ArrayList<Character> a = new ArrayList<>();
        for (char ch = 'A'; ch <= 'Z'; ch++)
        {
            a.add(ch);
        }

        System.out.println("Original List (UpperCase): " + a);

        for (int i=0; i<a.size();i++)
        {
            char ch = a.get(i);
            if ((int) ch % 2 == 0)
            {
            char c = (char)(ch + 32);
              a.set(i, c);
            }
        }

        System.out.println("Modified List Even ASCII (LowerCase): " + a);
    }
}


//public class Convertup_Low
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
		//System.out.println("Before convert:"+s1);
		//for (int i = 0; i < s1.size(); i++) 
            //{
			//char ch=s1.get(i);
			//if(ch>='A'&&ch<='Z'&&ch%2==0)
               //{
				//char  ch1=(char)(ch+32);
				//s1.set(i, ch1);
				//}
			//}
		//System.out.println("After convert Even Ascii:"+s1);
		 
		//}

//}