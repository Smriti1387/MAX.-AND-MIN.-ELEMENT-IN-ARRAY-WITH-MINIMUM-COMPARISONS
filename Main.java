// *****COMPARING IN PAIRS*****

import java.util.*;
public class Main
{
    static class Pair{
        int min;
        int max;
    
    }
    
    static Pair getminmax(int[] a,int n)
    {
        int i;
        Pair minmax=new Pair();
        if(n%2==0)
        {
            if(a[0]>a[1])
            {
                minmax.min=a[1];
                minmax.max=a[0];
            }
            else
            {
                minmax.min=a[0];
                minmax.max=a[1];
            }
            i=2;
        }
        else
        {
            minmax.min=a[0];
            minmax.max=a[0];
            i=1;
        }
        while(i<n-1)
        {
            if(a[i] >a[i+1])
            {
                if(a[i]>minmax.max)
                {
                   minmax.min=a[i]; 
                }
                if(a[i+1] <minmax.min)
                {
                    minmax.min=a[i+1];
                }
            }
            else
            {
                if(a[i+1]>minmax.max)
                {
                    minmax.max=a[i+1];
                    
                }
                if(a[i]<minmax.min)
                {
                    minmax.min=a[i];
                }
            }
            i+=2;
        }
        return minmax;
    }
     
      
	     public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        
	        int[] a=new int[n];
	    for(int i =0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    
	    int len=a.length;
	    Pair minmax=getminmax(a,len);
	    System.out.println("Minimum element = "+ minmax.min+"\n" +"Maximum element = "+minmax.max );
	}
}