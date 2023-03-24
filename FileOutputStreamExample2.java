package javaio;

import java.io.FileOutputStream;

public class FileOutputStreamExample2 {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("/home/sanjana-pt7186/Documents/testout2.txt");
			String s = "Welcome to javaTpoint.";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
