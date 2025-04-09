package List;
import java.util.ArrayList;
public class PrimeToSquare 
{
	public static void main(String[] args) 
    {
      ArrayList<Integer> a = new ArrayList<>();
          a.add(2);
          a.add(3);
          a.add(4);
          a.add(5);
          a.add(6);
          a.add(7);
          a.add(8);
          a.add(11);
       System.out.println("Original List: " + a);
         primesToSquare(a);
    System.out.println("Modified List Primes to Squares: " + a);
    }
    public static void primesToSquare(ArrayList<Integer> a1)
    {
        for (int i = 0; i < a1.size(); i++)
        {
            int num = a1.get(i);
            if (isPrime(num))
            {
                a1.set(i, num * num);
            }
        }
    }
    
    public static boolean isPrime(int num)
    {
        if (num <= 1) 
        {
            return false;
        }
        if (num == 2) 
        {
            return true;
        }
        if (num % 2 == 0) 
        {
            return false;
        }
        for (int i = 3; i * i<=num; i++)
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}
