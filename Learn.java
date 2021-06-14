
import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.awt.* ;
import java.text.NumberFormat;
public class Learn {

static long   myMethod(long  x)
{
   if(x==0) 
	   return 0;
   else
	   //stem.out.println(x) ;
	   return x+myMethod(x-1) ;
   
}
	public static void main(String[] args) {
		 long k=17_900L;
System.out.println(myMethod(k));
		
	}

}
