import java.util.Scanner;
public class Solution
{
	public void clearScreen()
	{
		//System.out.print("\33[H\033[2j");
		System.out.flush();
	}
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		Solution sol=new Solution();
		while(true)
		{
			System.out.println("Plese enter your choice:");
			System.out.println("1. SqureRoot:");
			System.out.println("2. Power:");
			System.out.println("3. Factorial:");
			System.out.println("4. Power of 2:");
			System.out.println("5. Log:");
			int choice=sc.nextInt();
			//System.out.flush();
			sol.clearScreen();
			switch(choice)
			{
				case 1: 
						System.out.println("Plese enter a number for squreRoot:");
						int root=sc.nextInt();
						for(int i=1;i<root/2;i++)
						{
							int res=root/i;
							if(res==i)
							{
								System.out.println("Value of SqureRoot is :"+res);
								break;
							}
						}
						break;
					
				case 2:
				
						System.out.println("Enter the 2 values for opeartion:");
						int x=sc.nextInt();
						int y=sc.nextInt();
						int res=(x*y)*(x+y);
						System.out.println("Result is :"+res);
						break;
					
				case 3:
						System.out.println("Plese enter a number to be factorial:");
						int fact=1;
						int n=sc.nextInt();
						for(int i=1;i<=n;i++)
						fact=fact*i;
						System.out.println("Factorial value is :"+fact);
						break;
				case 4:
						System.out.println("Plese enter the value to be power:");
						int pow=sc.nextInt();
						if(pow==0)
							System.out.println(1);
						else
						{	
							int result=1;
							for(int i=1;i<=pow;i++)
							{
								if(i==1)
									result=2;
								else
									result=result*2;
							}
							System.out.println("Result is:"+result);
						}
						break;
				case 5:
						System.out.println("Plese enter the value to be Log:");
						int xang=sc.nextInt();
						int yang=sc.nextInt();
						break;
					
				default : 
							System.exit(0);
			}
		}
	}
}