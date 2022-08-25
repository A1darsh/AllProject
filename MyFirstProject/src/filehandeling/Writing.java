package filehandeling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos =new FileOutputStream("new.txt",true);
	
		String str="adarsh mishra ag dgfs ";
		char[] ch=str.toCharArray();
		for (int i=0;i<str.length();i++) {
			fos.write(ch[i]);
			
		}

	}

}
