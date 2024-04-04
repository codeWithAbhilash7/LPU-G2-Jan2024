package com.fileio.seriliazationI;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {

	public static void main(String[] args) {
		File file = new File("./fileio/Students.txt");

		// writeObjectsToFile(file); // Serialization
		Student s[] = readObjects(file);

		for (Student student : s) {
			if (student != null)
				System.out.println(student);
		}

	}

	public static Student[] readObjects(File file) {
		Student s[] = new Student[8];

		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis);) {
			int index = 0;
			while (index < s.length) {
				Object obj = (Student) ois.readObject();
				if (obj instanceof Student) {
					s[index++] = (Student) obj;
				}
			}

		} catch (EOFException e) {
			System.out.println("Imported all the objects...:)");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 

		return s;
	}

	public static void writeObjectsToFile(File file) {

		Student s[] = new Student[5];
		s[0] = new Student(1, "Akshay", 78.45);
		s[1] = new Student(2, "Amit", 56.65);
		s[2] = new Student(3, "Vishal", 89.46);
		s[3] = new Student(4, "Sachin", 47.69);
		s[4] = new Student(5, "Heena", 96.74);

		try (FileOutputStream fout = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fout);) {

			for (Student student : s) {
				oos.writeObject(student);
				oos.flush();
			}

			System.out.println("Data exported successfully...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
