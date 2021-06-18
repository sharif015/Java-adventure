import java.util.Arrays;
import java.util.Scanner;

public class prime_number {
	public static int[] arr = new int[1000000] ;
	public static int[] gprime= new int[80000];
	static int t=0 ;
	
	
	public static void main(String[] args) {
		
 
 Scanner input=new Scanner(System.in) ;
 int n =input.nextInt() ;
  prime(n) ;
  
  
  for(int j=1 ;j<10000;j++)
	 {
		int k=n*j +1 ;
	
		if(check(k))
		{
			continue ;
		}
		else
		{
			print(j) ;
			break ;
		}
     
	 }
		 
		
		 
		}
	 

 

static void prime(int n)
{
	Arrays.fill(arr, 0); 

	
	for(int i=2 ;i*i<n ;i++)
	{
		if(arr[i]==0)
		{
			for(int j=i*i ;j<n ;j+=i)
			{
				arr[j]=1 ;
			}
		}
	}
	
	for(int i=2 ;i<n ;i++)
	{
		if(arr[i]==0)
		{
			gprime[t++]=i ;
		}
	}

}
static boolean check(int k)
{
	boolean test=false ;
	for (int e=0 ;e<t ;e++) {
        if (gprime[e] ==k) 
        {
             test = true;
             break ;
        }
           
        
	}
        return test ;
        
}
	
static void print(Object output)
{
	System.out.println(output) ;
}

}

