package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {
	public static void main(String[] args) {
		Long begin = System.currentTimeMillis();
		try {
			InputStream input = new FileInputStream("C:\\a.appxupload");
			OutputStream output = new FileOutputStream("E:\\b.appxupload");
			
			int c;
			while ((c = input.read())!= -1) {
				output.write(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
