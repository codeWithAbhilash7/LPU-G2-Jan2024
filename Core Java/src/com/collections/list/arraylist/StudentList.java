package com.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collections.Student;

public class StudentList {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		add(students);
		print(students);
//		Collections.sort(students);
//		print(students);

//		Comparator<Student> sortByIdDesc = new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o2.getId() - o1.getId();
//			}
//		};

//		Comparator<Student> sortByIdDesc = (o1, o2) -> o2.getId() - o1.getId();
//		Comparator<Student> sortByNameAsc = (o1, o2) -> o1.getName().compareTo(o2.getName());
//		Comparator<Student> sortByNameDesc = (o1, o2) -> o2.getName().compareTo(o1.getName());
//
//		Collections.sort(students, sortByIdDesc);
//		print(students);
//		
//		Collections.sort(students, sortByNameAsc);
//		print(students);
//		
//		Collections.sort(students, sortByNameDesc);
//		print(students);
		
		if(students.get(0).equals(students.get(1))) {
			System.out.println("Equal");
		} else {
			System.out.println("NOT Equal");
		}
	}

	private static void print(List<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("---------------------------------------------");
	}

	private static void add(List<Student> students) {
		students.add(new Student(1, "Rakesh", 57.97));
		students.add(new Student(3, "Sarang", 77.97));
		students.add(new Student(5, "Vishakha", 78.14));
		students.add(new Student(2, "Sachin", 87.44));
		students.add(new Student(4, "Sonali", 74.12));
		students.add(new Student(6, "Aman", 78.69));
	}

}
