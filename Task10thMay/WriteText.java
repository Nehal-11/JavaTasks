package Task10thMay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class WriteText {
	Scanner scan = new Scanner(System.in);
	String dir = System.getProperty("user.dir");

	void fileWrite() {
		System.out.println("enter file name: ");
		String fileName = scan.nextLine();

		String path = dir + File.separator + fileName;
		File oFile = new File(path);
		try {
			if (oFile.createNewFile()) {
				System.out.println("file created");
			} else {
				System.out.println("file already exists");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int numOfLines;

		System.out.println("enter the lines: ");
		numOfLines = scan.nextInt();
		scan.nextLine();
		try {
			FileWriter write = new FileWriter(path);
			BufferedWriter buffer = new BufferedWriter(write);
			for (int lineNumber = 0; lineNumber < numOfLines; lineNumber++) {
				buffer.write(scan.nextLine());
				buffer.newLine();

			}
			System.out.println("File written successfully.....");
			buffer.flush();
			buffer.close();
			// System.out.println("end");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
			e.printStackTrace();
		}

	}

	/*
	 * void read() { String line; int lineCount = 0, wordsCount = 0; try {
	 * FileReader read = new FileReader("D:sample2.txt"); BufferedReader buffer1 =
	 * new BufferedReader(read);
	 * 
	 * while ((line = buffer1.readLine()) != null) { lineCount++; String[] words =
	 * line.split(" "); wordsCount = wordsCount + words.length; }
	 * 
	 * } catch (IOException e) { // TODO Auto-generated catch block
	 * e.printStackTrace();
	 * 
	 * } System.out.println("counting line" + lineCount);
	 * System.out.println("words " + wordsCount); }
	 */
}