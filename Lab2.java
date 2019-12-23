import java.util.*;
public class Lab2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter n value");
		n=sc.nextInt();
		int a[]=new int[10];
		int i,max,min;
		System.out.println("enter array values");
		for(i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		max=a[0];
		min=a[0];
	for(i=0;i<n;i++){
		    if(a[i]<min)
		    min=a[i];
		}	
		for(i=0;i<n;i++){
		    if(a[i]>max)
		    max=a[i];
		}	
	
		System.out.println(min);
			System.out.println(max);
		
		
	}