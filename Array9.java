import java.util.Scanner;
public class Array9 {
	private static Scanner s;

	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int a[]=new int[n];
		int i,k = 0,l = 0,sum=0,sum1=0,sum2=0;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==6)
			{
				k=i;
			}
		}
		for(i=k;i<n;i++)
		{
			if(a[i]==7)
			{
				l=i;
			}
		}
		for(i=0;i<n;i++)
		{
			sum1=sum1+a[i];
		}
		for(i=k;i<=l;i++)
		{
			sum2=sum2+a[i];
			
		}
		sum=sum1-sum2;
		System.out.println(sum);
	}

}
