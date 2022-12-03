package com.firstProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of students");
			int n=sc.nextInt();
			 Student st[]=new Student[n];
			 for(int i=0;i<n;i++)
			 {
				 System.out.println("Enter the details of "+(i+1)+"  student");
				 System.out.println("Enter the semester");
					int sem=sc.nextInt();
					if(sem==1 || sem==2)
					{
						st[i]=new Student(sem);
						System.out.println();

					}
					else {
						System.out.println("Choose the correct semester 1/2");
					}		
			 }
			 
			 
		}
			
	}

}
