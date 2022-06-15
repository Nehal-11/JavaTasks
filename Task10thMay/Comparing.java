package Task10thMay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Comparing {
	Scanner scan = new Scanner(System.in);

	void createFile1() {
		File oFile1 = new File("D:sampleFile.txt");
		File oFile2 = new File("D:sampleFile2.txt");
		try {
			if ((oFile1.createNewFile()) && (oFile2.createNewFile())) {
				System.out.println("File created");

			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void write() {

		try {
			FileWriter writer1 = new FileWriter("D:sampleFile.txt");

			BufferedWriter buffer1 = new BufferedWriter(writer1);
			System.out.println("enter length: ");
			int number = scan.nextInt();
			scan.nextLine();
			for (int lineNum = 0; lineNum < number; lineNum++) {
				writer1.write(scan.nextLine());

			}
			buffer1.close();
			FileWriter writer2 = new FileWriter("D:sampleFile2.txt");

			BufferedWriter buffer2 = new BufferedWriter(writer2);
			System.out.println("enter length: ");
			int number1 = scan.nextInt();
			scan.nextLine();
			for (int lineNum = 0; lineNum < number1; lineNum++) {
				writer2.write(scan.nextLine());

			}
			buffer2.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	void readTwoFile() {

		try {
			FileReader read1 = new FileReader("D:sampleFile.txt");
			BufferedReader bufferRead = new BufferedReader(read1);
			String line1;
			int countingLine = 0, countingWord = 0;
			while ((line1 = bufferRead.readLine()) != null) {
				countingLine++;

				String[] words1 = line1.split(" ");
				countingWord = countingWord + words1.length;
			}

			bufferRead.close();
			System.out.println("total lines in file 1: " + countingLine);
			System.out.println("total words in file 1: " + countingWord);
			FileReader read2 = new FileReader("D:sampleFile2.txt");
			BufferedReader bufferRead2 = new BufferedReader(read2);
			String line2;
			int countingLine2 = 0, countingWord2 = 0;
			while ((line2 = bufferRead2.readLine()) != null) {
				countingLine2++;
				String[] words2 = line2.split(" ");
				countingWord2 = countingWord2 + words2.length;
			}
			bufferRead2.close();
			System.out.println("total lines in file 2: " + countingLine2);
			System.out.println("total words in file 2: " + countingWord2);

			if ((countingLine == countingLine2) && (countingWord == countingWord2)) {
				File oFile = new File("D:result.txt");
				FileWriter writer = new FileWriter("D:result.txt");
				BufferedWriter buffer = new BufferedWriter(writer);
				buffer.write("file equal");
				buffer.close();
				System.out.println("created successfully");
			} else {
				File oFile = new File("D:result.txt");
				FileWriter writer = new FileWriter("D:result.txt");
				BufferedWriter buffer = new BufferedWriter(writer);
				buffer.write("file not equal");
				buffer.newLine();
				writer.write("lines in 1: " + countingLine);
				writer.write("lines in 2: " + countingLine2);
				writer.write("words in 1: " + countingWord);
				writer.write("words in 2: " + countingWord2);
				writer.close();
				System.out.println("result file created");

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
