package com.fileio;

import java.io.File;
import java.io.IOException;

public class Directories {

	public static void parseDir(File path) throws IOException {
		if (path.isDirectory()) {
			File[] files = path.listFiles();

			for (File file : files) {
				if (file.isDirectory()) {
					parseDir(file);
				} else {
					System.out.println(file.getCanonicalPath());
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File path = new File("./fileio");
		if(path.delete()) {
			System.out.println("Deleted");
		} else {
			System.out.println("not Deleted");
		}
		//parseDir(path);
	}

}
