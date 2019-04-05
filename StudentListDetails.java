package com.java.collections;

import java.util.List;
import java.util.ArrayList;

public class StudentListDetails {

	List<Student> getStudentInfo() {
		List<Student> list = new ArrayList<Student>();
		Student s = new Student(); 			// first obj
		s.studentid = 246;
		s.studentname = "ravi";
		s.studentmobile = 989898789;
		s.studentage = 22;
		s.section = 'A';
		StudentAddress sa=new StudentAddress();
		s.saddress=sa;
		sa.city="hyderabad";
		sa.colony="ayodhya colony";
		sa.district="ranga reddy";
		sa.doornumber="9/70/23d ";
		sa.pincode=500080;
		list.add(s); 			// adding one object to list
		/*
		 * for (Student w:list) { System.out.println(w.studentname+"\t" + w.studentage +
		 * "\t" + w.studentmobile + "\t" + w.section); }
		 */
		Student s1 = new Student(); // second obj
		s1.section = 'B';
		s1.studentage = 24;
		s1.studentid = 420;
		s1.studentmobile = 812343654;
		s1.studentname = "raj";
		StudentAddress sa1=new StudentAddress();
		s1.saddress=sa1;
		sa1.city="Mysore   ";
		sa1.colony="sai colony";
		sa1.district="mysuru   ";
		sa1.doornumber="4/50/14w ";
		sa1.pincode=534000;
		list.add(s1);
		
		Student s2 = new Student();  // third obj
		s2.section = 'C';
		s2.studentage = 23;
		s2.studentid = 245;
		s2.studentmobile = 988553332;
		s2.studentname = "charan";
		StudentAddress sa2=new StudentAddress();
		s2.saddress=sa2;
		sa2.city="mangalore";
		sa2.colony="stev colony";
		sa2.district="mangaluru";
		sa2.doornumber="7/77/1000";
		sa2.pincode=5500006;
		list.add(s2);
		System.out.println(s2.studentage); // third obj value
		for (Student t : list) {
			System.out.println(t.studentname + " "); // total names in the list
		}

		
		Student s3 = new Student();  // fourth obj
		s3.section = 'D';
		s3.studentage = 21;
		s3.studentid = 245;
		s3.studentmobile = 988553332;
		s3.studentname = "ram";
		StudentAddress sa3=new StudentAddress();		//address class
		s3.saddress=sa3;								//sending address 
		sa3.doornumber="3/55/235 ";
		sa3.colony="jeevan colony";
		sa3.city="bangalore";
		sa3.district="kodihalli";
		sa3.pincode=560008;
	//System.out.println(s3.saddress.doornumber);
		
		list.add(s3);

		return list;

	}
}