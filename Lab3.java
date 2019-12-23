import java.util.*;
public class Lab3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,f=0;
		System.out.println("enter n value");
		n=sc.nextInt();
		int a[]={1,4,34,56,7} ;
		for(i=0;i<n;i++){
		  if(a[i]==n)
		  {
		      f=i+1;
		  }
		  
		
		}
		if(f!=0)
		System.out.println(f);
		else
		System.out.println(-1);
	}


	
}