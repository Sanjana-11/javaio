package javaio;

import java.io.*;

public class SequenceInputStreamExample1 {
	public static void main(String args[]) throws Exception {
		FileInputStream fin1 = new FileInputStream("/home/sanjana-pt7186/Documents/testin1.txt");
		FileInputStream fin2 = new FileInputStream("/home/sanjana-pt7186/Documents/testin2.txt");
		FileOutputStream fout = new FileOutputStream("/home/sanjana-pt7186/Documents/testout6.txt");
		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
		int i;
		while ((i = sis.read()) != -1) {
			fout.write(i);
		}
		sis.close();
		fout.close();
		fin1.close();
		fin2.close();
		System.out.println("Success..");
	}

}
