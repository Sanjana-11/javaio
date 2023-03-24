package javaio;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("/home/sanjana-pt7186/Documents/testout2.txt");
			int i = fin.read();
			System.out.print((char) i);

			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
