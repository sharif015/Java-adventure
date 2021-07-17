import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class stack {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.next();
		System.out.println(maxDepth(s));
		
		
	}
	 public static int maxDepth(String s) {
	        Stack<Character> stack=new Stack<Character>();
	        Scanner input=new Scanner(System.in);
	       
	        int l=s.length();
	        int ans=0 ;
	        Vector<Integer> V = new Vector<Integer>();
	        for(int i=0;i<l;i++)
	        {
	            if(s.charAt(i)=='(')
	            {
	                stack.push(s.charAt(i));
	                V.add(stack.size());
	            }
	            else if(s.charAt(i)==')')
	            {
	                stack.pop();
	                V.add(stack.size());
	            }
	        }
	        int max=0 ;
	        for(int u:V)
	        {
	            if(max<u)
	                max=u ;
	        }
	        return max ;
	        
	    }

}
