import java.util.*;
public class Lab6
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter n value");
		n=sc.nextInt();
		int a[]=new int[n];
		int i,temp,j;
		System.out.println("enter array values");
		for(i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
	for(i=0;i<n;i++){
	    for(j=0;j<n;j++){
		    if(a[i]<a[j]){
		        temp=a[j];
		        a[j]=a[i];
		        a[i]=temp;
		    }
		}	
	}
	for(i=0;i<n;i++){
	    System.out.print(a[i]);
	}
		
		
	}
	
			
		
		
	}