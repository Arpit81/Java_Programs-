import java.io.File;
import java.io.IOException;

public class Fifth {

	public static void main(String[] args) throws IOException {
		
		File f1= new File("C:\\Users\\Arpit\\Desktop\\Arpit.java");
		f1.mkdir();
		File f2= new File("C:\\Users\\Arpit\\Desktop\\code\\java.java");
        f2.mkdirs();
		//System.out.print(f1);
		
		System.out.println(f1.getTotalSpace());
		System.out.println(f1.getFreeSpace());
		System.out.println(f1.getUsableSpace());
		System.out.println(f1.length());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getAbsoluteFile());
		
		File  t=f1.getAbsoluteFile();
		System.out.println(t.getName());
		
		String location1=("C:\\Users\\Arpit\\Desktop\\Arpit.java");
		File  f3=new File(location1);
		String location2=("C:\\Users\\Arpit\\Desktop\\code.java");
		File  f4=new File(location2);
		
		System.out.println(f3.compareTo(f4));
		
		f1.setReadOnly();
		f1.setWritable(true);
		f1.setExecutable(true);
		
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.getCanonicalPath());
		 System.out.println(f1.getCanonicalFile());
		
		System.out.println(f1.getParent());
		System.out.println(f1.getParentFile());
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		
		System.out.println(f1.isHidden());
		
		System.out.println(f1.renameTo(f4));
		
		
		System.out.println(f1.toURI());
		
		System.out.println(f1.toURI().toURL());
		
	
		
	}
}
