import java.io.File;
import java.io.IOException;

public class Batchmates{
	public static void main(String[] args)  throws IOException {
		File batchmate = new File("c:\\deloitte\\Batch\\Batchmates.txt");
		if (batchmate.exists()) {
			System.out.println("File Exists");
		}
		else {
			batchmate.createNewFile() ;
			System.out.println("File created");
		}
		File temp = new File("c:\\deloitte\\Batch");
		File[] list = temp.listFiles();
		for(File f:list) {
			if (f.isFile()){
				System.out.println(f + " is a file");
			}
			else {
				System.out.println(f + " is a folder");
			}
	}
}
}
