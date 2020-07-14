import java.io.File;

public class Second {
	public static void main(String[] args)
	{
		File f=new File("F://");
	   File[] ff =f.listFiles();
	   for(int i=0;i<ff.length;i++)
	   {
		   
		   
		   if(ff[i].isDirectory())
		   {
			   System.out.println("folder" +"  "+ ff[i].getName());
		   }
		   else
		   {
			   System.out.println("File" +"  " +ff[i].getName());

			   
		   }
	   }
	}

}
