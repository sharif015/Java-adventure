import java.util.Scanner;

public class Agent_J {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in) ;
		int t=input.nextInt() ;
		for(int i=0 ;i<t ;i++)
		{
		double r1 =input.nextDouble();
		double r2 =input.nextDouble();
		double r3 =input.nextDouble();
		double ans1=0.0f ;
		double a,b,c ;
		a=r1+r2 ; b=r2+r3 ;c=r1+r3 ;
	 ans1=area(a,b,c)-area_sector(r1, r2, r3, a, b, c);
		System.out.println("Case "+(i+1)+": "+String.format("%.10f", ans1));
		}
		

	}
	
	
	
	
	
	public static  double area(double a,double b,double c)
	{
		double s=(a+b+c)/2 ;
		double k = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return k ;
	}
	public static double angle_A(double a,double b,double c)
	{
		return  Math.acos((b*b+c*c-a*a)/(2*c*b));
	}
	
	public static  double angle_B(double a,double b,double c)
	{
		return Math.acos((a*a+c*c-b*b)/(2*a*c));
	}
	
	public static  double angle_C(double a,double b,double c)
	{
		return Math.acos((a*a+b*b-c*c)/(2*a*b));
	}
	public static double area_sector(double r1,double r2,double r3,double a,double b,double c)
	{
		double A= (.5*r1*r1*angle_A(a,b,c));
		double B=(.5*r1*r1*angle_B(a,b,c));
		double C= (.5*r1*r1*angle_C(a,b,c));
		return A+B+C ;
		
	}

}
