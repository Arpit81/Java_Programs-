import java.io.File;

public class First {

	public static void main(String[] args)
	{
		File[] drives=File.listRoots();
		for(int i=0;i<drives.length;i++)
		{
			System.out.println(drives[i]);
		}
	}
}
