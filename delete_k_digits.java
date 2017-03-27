import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int k,i,eli=0,count,index=0,n;
		String a;
		Scanner sc=new Scanner(System.in); a=sc.next();
		k=sc.nextInt(); 
		while(k--!=0){ count=0;
		    char[] temp=a.toCharArray();
		    n=a.length();  eli=0;
		    for(i=0;i<n-1;i++){
		          if(temp[i]<=temp[i+1]){     
		              eli=i+1; 
		              continue;
		          }
		          else{
		                count++;              // System.out.println(temp[eli]);  
		                temp[eli]=' ';
		              	a=String.valueOf(temp);
		                String[] s=a.split(" ");
		                a=s[0].concat(s[1]);   
		                break;
		          }
		         
		      }
		           if(count==0){     //  System.out.println(temp[n-1]);
		                temp[n-1]=' ';		                		              	
		                a=String.valueOf(temp);
		                a=a.trim();
		    }
		}
			System.out.println(a);
		}
}
