import java.util.*;
public class Lab1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter n value");
		n=sc.nextInt();
		int a[]=new int[10];
		int i,sum=0;
		float avg;
		System.out.println("enter array values");
		for(i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
	for(i=0;i<n;i++){
		    sum=sum+a[i];
		}	
		avg=sum/n;
		System.out.println(avg);
		
	}
