import java.util.*;
class allpairs
{
	public static void main(String args[])
	{
		int n;
		Scanner ob=new Scanner(System.in);
		System.out.println("enter n:");
		n=ob.nextInt();	
		int[][] a=new int[n+1][n+1];
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter row "+(i)+"ele:");
			for(int j=1;j<=n;j++)
			{
				a[i][j]=ob.nextInt();
			}
		}
		for(int k=1;k<=n;k++)
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
				{
					if(a[i][j]>a[i][k]+a[k][j])
						a[i][j]=a[i][k]+a[k][j];
				}
		for(int i=1;i<=n;i++)
		{
			System.out.println();
			for(int j=1;j<=n;j++)
				System.out.print(a[i][j]+" ");
		}
	}
}
/*
enter n:
3
enter row 1ele:
0 4 11
enter row 2ele:
6 0 2
enter row 3ele:
3 99 0

0 4 6
5 0 2
3 7 0*/