package javaio;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("/home/sanjana-pt7186/Documents/testout.txt");
			fout.write(65);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
