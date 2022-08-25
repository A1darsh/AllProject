package filehandeling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInput {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("abc.txt");

		BufferedInputStream bf = new BufferedInputStream(fis);
		int ch = 0;
		while ((ch = bf.read()) != -1) {
			System.out.print((char) ch);

		}

	}

}
