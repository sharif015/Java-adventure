import java.util.Scanner;

public class cp {

	public static void main(String[] args) {
		String s ;
		Scanner input= new Scanner(System.in) ;
		s=input.nextLine() ;
		
		int l =s.length() ;
		int ans=0 ;
		
		int t=s.charAt(0)-'a' ;
		int d =26-t ;
		ans+=check(t,d) ;
		for(int i=1 ;i<l ;i++)
		{
			int m = s.charAt(i-1)-'a';
			int n =Math.abs((s.charAt(i)-'a')-m);
			int o =26-n ;
			ans+=check(n,o) ;
			
			
			
		}
		
		print(ans) ;
	}
	
	static void print( Object output  )
	{
		System.out.println(output) ;
	}
	static int check(int a ,int b)
	{
		return a>b ? b: a ;
		
	}

}
