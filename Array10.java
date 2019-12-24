import java.util.Scanner;

public class Array10 {
		private static Scanner s;

		public static void main(String[] args)
		{
			s = new Scanner(System.in);
			int n;
			n=s.nextInt();
			int a[][]=new int[n][n];
			int i,j;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();

			}
			}
			for(i=0;i<n;i++)
			{
				for(j=n-1;j>=0;j--)
			{
					System.out.print(a[i][j]+" ");

			}
				
				System.out.println("\n");
			}

}
}