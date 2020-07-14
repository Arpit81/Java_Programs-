import java.util.Scanner;
public class KPattern
{
	
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plese enter no of iteration in the loop:");
		int size=sc.nextInt();
		int s=1;
		for(int i=size;i>=-size;i--)
		{
			if(i>0||i<0)
				s=Math.abs(i);
			for(int j=0;j<=size;j++)
			{
				if(j==0||j==s)
				{
					if(i==0&&j==1)
						System.out.print("   ");
					else
					System.out.print(" * ");
				}
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}