/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class equalindex
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,z=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[10];
		Vector v=new Vector();
		for(i=0;i<n;i++)
		{  a[i]=sc.nextInt();
		   if(a[i]==i)
		     {v.addElement(i);
		      z++;   
		     }
		   else if(a[i]>i)
		     break;
		}
		Iterator p=v.iterator();
		while(p.hasNext())
		 System.out.println(p.next());
		
	}
}
