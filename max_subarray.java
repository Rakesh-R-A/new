import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here 
		int n,i,y,z=0,sum,max=0,p=0,q=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		  a[i]=sc.nextInt();
		while(n!=1){
		    sum=0;
		    for(y=i=z;i<n;i++)
		      sum+=a[i];
		    if(sum>=max)    
		      {
		          //System.out.println(y+" "+n+"sum is"+sum);
		          max=sum;
		          p=y; q=n;
		      }
		    if(z<=n-2)
		      z++;
		    else
		    {
		        z=0;n--;
		    }
		}
		while(p<=q-1)
		  System.out.print(a[p++]+" ");
		
	}
}
