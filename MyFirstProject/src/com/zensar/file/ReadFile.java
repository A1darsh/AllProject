package com.zensar.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ReadFile {

	public static void main(String[] args) {
		//FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			FileInputStream fis = new FileInputStream("abc.txt");

			BufferedInputStream br = new BufferedInputStream(fis);

			fos = new FileOutputStream("pqr.txt");
			int ch = 0;
			while ((ch = br.read()) != -1) {
				fos.write(ch);
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				/////if (fis != null) {
				//	fis.close();

				//}
				if (fos != null) {
					fos.close();

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
