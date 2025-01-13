package Workshop8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		ArrayList<Student> students=new ArrayList<Student>();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int num=in.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Enter name of student: ");
			in.nextLine();
			String name=in.nextLine();
			System.out.println("Enter age of student: ");
			int age=in.nextInt();
			System.out.println("Enter grade of 4 subjects: ");
			double a=in.nextDouble();
			double b=in.nextDouble();
			double c=in.nextDouble();
			double d=in.nextDouble();
			
			Student s=new Student(name,age,a,b,c,d);
			students.add(s);
		}
		for (Student student: students) {
			System.out.println("Name of student = "+student.getName());
			System.out.println("Age of student = "+student.getAge());
			System.out.println("Average of student = "+student.getAverage());
		}
		in.close();
	}
}
