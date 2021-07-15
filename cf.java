import java.util.Arrays;
import java.util.Scanner;

public class cf {

	
	public static int[] arr=new int [163900] ;
	public static int[] arr1=new int [15011] ;
	     
	
	public static void main(String[] args) {
		
		Arrays.fill(arr,0); 
		prime(163850);
		Scanner input=new Scanner(System.in) ;
		int n=input.nextInt();
		for(int i=0 ;i<n ;i++)
		{
			int k=input.nextInt();
			System.out.println(arr1[k]);
		}
		
		}
		

	
public static void prime(int n)
{
	for(int i=2 ;i*i<n;i++)
	{
		if(arr[i]==0)
		{
			for(int j=i*i ;j<=n ;j+=i)
			{
				arr[j]=1 ;
			}
		}
	}
	int j=1 ;
	for(int i=2;i<n ;i++)
	{
		
		if(arr[i]==0)
		{
			arr1[j++]=i ;
			
		}
	}
	
}
}


