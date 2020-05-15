import java.util.Scanner;

public class Question2 {
	public static void main(String args[])
	{
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter series");
		int count=sc.nextInt();
		
		for(int i=1;i<=count;i++)
		{
			
			System.out.print("if a:"+i+" ");
		
			System.out.println("then Output:");
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				System.out.println(j);
				else if(j%2 == 0)
				{
					System.out.print(j);
					for(int k=j-1;k>=1;k--)
					{
						System.out.print(" * "+k);
					}
					System.out.println();
				}
				else
				{
					System.out.print(1);
					for(int k=2;k<=j;k++)
					{
						System.out.print(" * "+k);
					}
					System.out.println();

				}
			}
			System.out.println();
		}
	}
}
