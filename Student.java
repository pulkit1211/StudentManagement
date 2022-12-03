package com.firstProject;

import java.util.Scanner;

import com.firstProject.*;

public class Student {
	 public String name;
	   Scanner sc=new Scanner(System.in);
	   public Student(int sem)
	   {
		   System.out.println("Enter the name of the Student");
		   this.name=sc.next();
		   if(sem==1)
		   {
			   Semester1 semester=new Semester1();
			   System.out.println("Enter the Semester1 Marks");
			   System.out.println("Enter the MARks of Maths");
			   semester.Maths=sc.nextInt();
			   System.out.println("Enter the MARks of English");
			   semester.English=sc.nextInt();
			   System.out.println("Enter the MARks of Science");
			   semester.Science=sc.nextInt();
			   int percentage=(semester.English+semester.Maths+semester.Science)/3;
			   System.out.print("Student name:- "+name+"  "+"Maths mark:- "+semester.Maths+" "+"English Marks:- "+semester.English+" "+"Science Marks:- "+semester.Science+" "+"percentage:- "+percentage);
			   
		   }
		   else if(sem==2)
		   {
			   Semester2 semester2=new Semester2();
			   System.out.println("Enter the Semester2 Marks");
			   System.out.println("Enter the MARks of Maths");
			   semester2.Maths=sc.nextInt();
			   System.out.println("Enter the MARks of English");
			   semester2.English=sc.nextInt();
			   System.out.println("Enter the MARks of Science");
			   semester2.Science=sc.nextInt();
			   int percentage=(semester2.English+semester2.Maths+semester2.Science)/3;
			   System.out.print("Student name:- "+name+"  "+"Maths mark:- "+semester2.Maths+" "+"English Marks:-  "+semester2.English+" "+"Science Marks:- "+semester2.Science+" "+"Percentage"+percentage);
		   }
		  
	   }
}
