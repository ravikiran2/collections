package com.java.collections;

import java.util.List;

public class StudentListDetailsTest {

	public static void main(String[] args) {
		StudentListDetails stu=new StudentListDetails();
		stu.getStudentInfo();
		System.out.println("-------------------------------");
		List<Student> details=stu.getStudentInfo();
		for(Student w:details) {
			System.out.println(w.studentname+"\t"+w.section+"\t"+w.studentid+"\t"+w.studentmobile+"\t"+w.studentage+"\t"+w.saddress.colony+"\t"+w.saddress.doornumber+"\t"+w.saddress.city+"\t"+w.saddress.district+"\t"+w.saddress.pincode);
		}
	
	}

}