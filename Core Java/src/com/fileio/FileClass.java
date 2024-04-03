package com.fileio;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {
		File file = new File(".\\fileio\\demo.txt");
		try {
			if (file.createNewFile())
				System.out.println("File has been created..");
			else {
				System.out.println("File exists already...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

//		if (file.canWrite()) {
//			System.out.println("File has write access");
//		} else {
//			System.out.println("This file has no write access");
//		}

//		if (file.exists()) {
//			System.out.println("The file exists");
//		} else {
//			System.out.println("The file does not exist");
//		}

//		System.out.println("AbsolutePath = " + file.getAbsolutePath());
//		System.out.println("CanonicalPath = " + file.getCanonicalPath());
//
//		System.out.println("Name = " + file.getName());
//		System.out.println("Parent = " + file.getParent());
//		System.out.println("Last modified = " + file.lastModified());

//		System.out.println("Parent = " + file.renameTo(new File("./fileio/Demo2.txt")));

		file.setWritable(false);

	}

}
