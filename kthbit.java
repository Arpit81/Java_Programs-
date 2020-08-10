
public class Test2 {

	public static void main(String[] args) {
		
		
		 kth1();
	}
		
		static void kth ()
		{
			int n=5,k=3;
		if((n&(1<<(k-1)))!=0)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
			
		
	
	}
		
		static void kth1() {
			int n=13,k=3;
			if((n>>(k-1)&1)==1)
			{
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}

}
