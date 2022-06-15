package Task10thMay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadText {
	Scanner scan = new Scanner(System.in);
	String dir = System.getProperty("user.dir");

	void read() {
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
		String line;
		int lineCount = 0, wordsCount = 0;
		System.out.println("enter the lines to store in text file: ");
		numOfLines = scan.nextInt();
		scan.nextLine();
		try {
			FileWriter write = new FileWriter(path);
			BufferedWriter buffer = new BufferedWriter(write);
			for (int lineNumber = 0; lineNumber < numOfLines; lineNumber++) {
				buffer.write(scan.nextLine());
				buffer.newLine();
			}

			buffer.close();
			// System.out.println("end");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
			e.printStackTrace();
		}

		try {
			FileReader read = new FileReader(path);
			BufferedReader buffer1 = new BufferedReader(read);

			while ((line = buffer1.readLine()) != null) {
				lineCount++;
				String[] words = line.split(" ");
				wordsCount = wordsCount + words.length;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error,try again!");
			e.printStackTrace();

		}
		System.out.println("total lines in the text file: " + lineCount);
		System.out.println("total words in the text file: " + wordsCount);
	}
}
