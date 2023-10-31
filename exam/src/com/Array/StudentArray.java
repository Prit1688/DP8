package com.Array;

// create array of students,student has(roll,name,age,marks).print only
//those students who have marks more than 60 and age is less than 15.
public class StudentArray {
	Student std[];

	public StudentArray() {

	}

	public StudentArray(Student std[]) {
		this.std = std;
	}

	public void elements() {

		for (int i = 0; i < std.length; i++) {
			if (std[i].getm() > 70 && std[i].geta() < 20)
				System.out.println(std[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1[] = new Student[4];
		s1[0] = new Student(1, "prit", 25, 60);
		s1[1] = new Student(2, "pritam", 14, 67);
		s1[2] = new Student(3, "pritya", 16, 76);
		s1[3] = new Student(4, "pritu", 18, 67);

		StudentArray s2 = new StudentArray(s1);
		s2.elements();

	}

}
