import java.util.Arrays;
import java.util.Scanner;

public class data_structure {

	public static int[] arr=new int[10];
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String s =input.next();
		
		Arrays.fill(arr,0);
		int l=0 ,r=9 ;
		for(int i=0 ;i<n;i++)
		{
			
			if(s.charAt(i)=='L')
			{
				if(l>=0)
				{
					int k=check(l);
					arr[k]=1 ;
					l++ ;
				}
				else
				{
					arr[l]=1 ;
					l++ ;
				}
			}
			else if(s.charAt(i)=='R')
			{
				if(r<=9)
				{
					int k=checkr(r);
					arr[k]=1 ;
					r-- ;
				}
				else
				{
					arr[r]=1 ;
					r-- ;
				}
			}
			else
			{
				int k=s.charAt(i)-'0' ;
			     arr[k]=0 ;
			}
		}
		for(int i=0;i<10 ;i++)
		{
			System.out.print(arr[i]);
		}
		
	}
	public static int  check(int l)
	{
		for(int i=0;i<=9;i++)
		{
			if(arr[i]==0)
			{
				return i ;
			}
		}
		return l;
	}
	
	public static int  checkr(int r)
	{
		for(int i=9;i>=0 ;i--)
		{
			if(arr[i]==0)
			{
				return i ;
			}
		}
		return r;
	}

}
