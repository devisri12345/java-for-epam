
import java.util.Scanner;
public class Array8 {
	private static Scanner s;

	public static void main(String [] args)
	{
		s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int a[]=new int[n];
		int i,j,k,l=0,max=0;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{k=1;
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					k++;
					
				}
				
			}
			if(max<k) {
				max=k;
				l=a[i];
			
			}
			
		}
		
			System.out.println(l);	

		
	}

}
