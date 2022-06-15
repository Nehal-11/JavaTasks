package Task21encapsulation;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***** New Student Registration Details *****");

		Student oStudent = new Student();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the new student details:");
		oStudent.setName(scan.next());
		oStudent.setEmail(scan.next());

		oStudent.setAdmissionId(scan.nextInt());
		oStudent.setPhNum(scan.nextLong());

		/*System.out.println("New Student name: " + oStudent.getName());
		System.out.println("New Student Mail Id: " + oStudent.getEmail());
		System.out.println("Student's Admission Id: " + oStudent.getAdmissionId());
		System.out.println("Student registered phone number: " + oStudent.getPhNum());*/

	}

}