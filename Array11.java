import java.util.Scanner;
public class Array11 {

		private static Scanner s;

		public static void main(String[] args)
		{
			s = new Scanner(System.in);
			
			int a[][]=new int[3][3];
			int i,j,k=0,max=0;
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
				k++;

			}
			}
			if(k!=9)
			{
				System.out.println("enter 9 numbers");
			}
			else
			{
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
				{
						if(max<a[i][j])
						{
							max=a[i][j];
				} 
				}
				}
				System.out.println("maximum number is "+max);
			}
		}
}
