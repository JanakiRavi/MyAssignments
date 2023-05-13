package week3day1assignment.org.student;

import week3day1assignment.org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student Name is Janaki");
	}
	public void studentDept() {
		System.out.println("Student Department is ECE");
	}

	public void studentId() {
		System.out.println("Student ID is 12EC1230");
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.CollegeRank();
		stu.deptName();
		stu.studentDept();
		stu.studentId();
		stu.studentName();
		

	}

}
