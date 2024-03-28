package com.fileio.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./fileio/demo.txt");
		// writeToFile(file);
		readFromFile(file);
	}

	static void readFromFile(File filePath) {
		try (FileInputStream fis = new FileInputStream(filePath)) {
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void writeToFile(File filePath) {

		try (FileOutputStream fout = new FileOutputStream(filePath, true)) {
			String content = LocalDateTime.now()
					+ "\tJava is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.\n";
			fout.write(content.getBytes());
			System.out.println("Success");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
