package com.fileio.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		File file = new File("./fileio/demo.txt");
		// writeToFile(file);

		try {
			FileReader fr = new FileReader(file);
			Scanner sc = new Scanner(fr);

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

			sc.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void writeToFile(File file) {
		try (FileWriter fw = new FileWriter(file, true);) {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.print("Enter a msg : ");
				String msg = sc.next();
				String content = LocalDateTime.now() + "\t" + msg + "\n";
				System.out.println(content);
				fw.write(content);
				System.out.println("Success!!!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
