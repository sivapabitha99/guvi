import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
	Scanner s=new Scanner(System.in);
    System.out.println("");
    a=s.nextInt();
    if(a>0)
    {
    	System.out.println("Positive");
    	
    }
    else if(a==0)
    {
    	System.out.println("Zero");
    }
    else
    {
    	System.out.println("Negative");
    }
}
}
