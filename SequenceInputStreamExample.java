package javaio;

import java.io.*;  

public class SequenceInputStreamExample {
	public static void main(String args[]) throws Exception {
		FileInputStream input1 = new FileInputStream("/home/sanjana-pt7186/Documents/testin.txt");
		FileInputStream input2 = new FileInputStream("/home/sanjana-pt7186/Documents/testout5.txt");
		SequenceInputStream inst = new SequenceInputStream(input1, input2);
		int j;
		while ((j = inst.read()) != -1) {
			System.out.print((char) j);
		}
		inst.close();
		input1.close();
		input2.close();
	}
}
