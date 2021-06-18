import java.util.Scanner;

public class cordinate_reach {

	public static void main(String[] args) {
		int testcase ;
		Scanner input=new Scanner(System.in) ;
		testcase= input.nextInt() ;
		for(int j=0;j<testcase;j++)
		{
			
			
			int x,y ;
			x=input.nextInt();
			y=input.nextInt();
			String s=input.next();
			int U=0,D=0,R=0,L=0 ;
			for(int i=0 ;i<s.length() ;i++)
			{
				if(s.charAt(i)=='U')
				{
					U++ ;
				}
				if(s.charAt(i)=='D')
				{
					D++ ;
				}
				if(s.charAt(i)=='R')
				{
					R++ ;
				}
				if(s.charAt(i)=='L')
				{
					L++ ;
				}
				
			}
			
			if(x>=-L && x<=R && y>=-D && y<=U)
			{
              print("YES") ;
			}
			else
              print("NO") ;
			
		}
		
		

	}
	static void print(Object output)
	{
		System.out.println(output) ;
	}

}
