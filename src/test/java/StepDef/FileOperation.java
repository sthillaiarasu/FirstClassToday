package StepDef;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class FileOperation {

	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Studies\\fileoperation\\file\\operation");
		
		File dest=new File("C:\\Studies\\fileoperation\\");
		
		FileUtils.copyDirectory(file, dest);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
