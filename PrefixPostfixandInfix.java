package List;
import java.util.Stack;
public class PrefixPostfixandInfix 
{
	public static boolean isOperator(char ch)
	{
        return ch=='+'|| ch=='-'||ch=='*'||ch=='/';
    }
	public static boolean isOperand(char ch)
	{
        return(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9');
    }

    public static String prefixToInfix(String prefix)
    {
    	Stack<String> stack = new Stack<>();
        for (int i=prefix.length()-1;i>=0;i--) 
        {
            char ch = prefix.charAt(i);
            if (isOperand(ch)) 
            {
                stack.push(String.valueOf(ch));
            }
            else if (isOperator(ch)) 
            {
                if (stack.size()>=2) 
                {
                    String operand1 = stack.pop();
                    String operand2 = stack.pop();
                    stack.push("("+operand1+ch+operand2+")");
                } 
                else 
                {
                    return "Invalid Prefix Expression";
                }
            }
        }
        return stack.size()==1 ?stack.pop():"Invalid Prefix Expression";
    }

    public static String postfixToInfix(String postfix)
    {
    	Stack<String> stack = new Stack<>();
        for (int i=0;i<postfix.length();i++) 
        {
            char ch=postfix.charAt(i);
            if (isOperand(ch))
            {
            	stack.push(String.valueOf(ch));
            } 
            else if (isOperator(ch)) 
            {
                if (stack.size()>=2) 
                {
                    String operand2 = stack.pop();
                    String operand1 = stack.pop();
                    stack.push("("+operand1 +ch+operand2 +")");
                } 
                else
                {
                    return "Invalid Postfix Expression";
                }
            }
        }
        return stack.size()==1 ?stack.pop():"Invalid Postfix Expression";
    }

    public static void main(String[] args)
    {
        String prefix1 ="+ABCD-*";
        String infix1 = prefixToInfix(prefix1);
        System.out.println("Prefix: " + prefix1 + " = Infix: " + infix1);

        String prefix2 ="+*ABCD+";
        String infix2 = prefixToInfix(prefix2);
        System.out.println("Prefix: " + prefix2 + " = Infix: " + infix2);
       
        String postfix1 ="AB+CD-*";
        String infixFromPostfix1 = postfixToInfix(postfix1);
        System.out.println("Postfix: AB+CD-* = Infix: " + infixFromPostfix1);
        
        String postfix2 ="AB*CD++";
        String infixFromPostfix2 = postfixToInfix(postfix2);
        System.out.println("Postfix: AB*CD++ = Infix: " + infixFromPostfix2);
    }
    }