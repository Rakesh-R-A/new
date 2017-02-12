import java.util.*;
import java.lang.*;
import java.io.*;
class arrange {
  public static void main(String args[]) throws Exception {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          Scanner sc=new Scanner(System.in);
          int n,i,j;
          n=sc.nextInt();
          String a[]=new String[n],temp;
    for( i=0;i<n;i++)
      a[i]=sc.next();
 
  for(i=0;i<n;i++){
      for(j=i+1;j<n;j++){
          if(a[i].length()<a[j].length())
            {
                if(a[i].compareTo(a[j].substring(0,a[i].length()))==0)
                  {
                      if(a[i].compareTo(a[j].substring(1,1+a[i].length()))<0)
                      {
                         temp=a[i];a[i]=a[j];a[j]=temp; 
                      }
                  }
                else if(a[i].compareTo(a[j].substring(0,a[i].length()))<0)
                  {
                      temp=a[i];a[i]=a[j];a[j]=temp;
                  }
                  
            }
            else if(a[i].length()>a[j].length())  
                {// System.out.println(a[i]+" aof"+i+" and aof"+j+" "+ a[j]);
                  if(a[j].compareTo(a[i].substring(0,a[j].length()))>0)
                  {
                      temp=a[i];a[i]=a[j];a[j]=temp;
                  }  
                  else if(a[j].compareTo(a[i].substring(0,a[j].length()))==0)
                   {
                     // temp=a[i];a[i]=a[j];a[j]=temp;  latest
                     if(a[j].compareTo(a[i].substring(1,1+a[j].length()))>0)
                      {
                         temp=a[i];a[i]=a[j];a[j]=temp; 
                      }
                   }
                }
            else if(a[i].length()==a[j].length())
            {
                if(a[i].compareTo(a[j])<0)
                  {temp=a[i];a[i]=a[j];a[j]=temp; }
            }
                  
            }
      }
 List<String> l=new ArrayList(Arrays.asList(a));
     System.out.print(l);
  }
  
}
