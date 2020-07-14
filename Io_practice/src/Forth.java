import java.io.File;
import java.io.IOException;

public class Forth {

	public static void main(String[] args) throws IOException
	{
		File f1=new File("f://deep//jadu");
	
		File file =new File(f1,"deep.java");
	
		long mod =file.lastModified();
		System.out.println(mod);
		//file.createNewFile();
		//file.delete();
		//file.createTempFile("arpit", ".jpeg");
		//System.out.println(file.getAbsolutePath());
		//f1.mkdirs();
		//f1.delete();   
		
	}
}
