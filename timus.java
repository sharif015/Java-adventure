import java.util.Scanner;

public class timus {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in) ;
		int testcase ;
		testcase=input.nextInt() ;
		for(int i=0 ;i<testcase ;i++ )
		{
		double n=input.nextInt() ;
		double  s=8*n-7 ;
		double k=Math.sqrt(8*n-7);
        double t=(int) Math.sqrt(s) ;
   
		if(k==t)
		{
			System.out.print(1+" ");
		}
		else
		{
			System.out.print(0+" "); 
		}
		}

	}

}
