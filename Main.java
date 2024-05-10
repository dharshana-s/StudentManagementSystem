import java.io.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
    	int nStudents=0;
    	int iStudId=0;
    	String sStudName ="";
    	String sfName = "";
    	String smName = "";
    	String sGrade="";
    	int sAttendance = 0;
    	
        StudentManagementSystem sms = new StudentManagementSystem();

        
        System.out.println("Enter no. of student records to create newly:");
        // Using Scanner for Getting Student Information from user
        Scanner objScanner = new Scanner(System.in);
        nStudents=objScanner.nextInt();
        
        //create new records
        for(int i=1; i<=nStudents; i++)
        {
      	  System.out.println("Enter Student Id: ");
      	  objScanner = new Scanner(System.in);
      	  iStudId = objScanner.nextInt();
      	  
      	  System.out.println("Enter Student Name: ");
      	  objScanner = new Scanner(System.in);
      	  sStudName= objScanner.nextLine();
      	  
      	  System.out.println("Enter Father Name: ");
    	  objScanner = new Scanner(System.in);
    	  sfName = objScanner.nextLine();
    	  
    	  System.out.println("Enter Mother Name: ");
    	  objScanner = new Scanner(System.in);
    	  smName = objScanner.nextLine();
      	  
      	  System.out.println("Enter Grade: ");
      	  objScanner = new Scanner(System.in);
      	  sGrade= objScanner.nextLine();
      	  
      	  System.out.println("Enter Attendance: ");
      	 objScanner = new Scanner(System.in);
      	 sAttendance = objScanner.nextInt();
      	        	  
      	  sms.addStudent(new Student(iStudId, sStudName, sfName, smName, sGrade, sAttendance));
          }

        // Read and display students
        System.out.println("Students List:");
        sms.viewStudents();

        //Get the option to add/update/delete
        System.out.println("Enter the option.... 1 for add, 2 for update, 3 for delete");
        objScanner = new Scanner(System.in);
    	int iOption = objScanner.nextInt();
    	switch(iOption)
    	{
    	case 1: //Adding New Student
    		System.out.println("Enter Student Id :");
        	objScanner = new Scanner(System.in);
          	iStudId = objScanner.nextInt();
          	  
          	System.out.println("Enter Student Name: ");
          	objScanner = new Scanner(System.in);
          	sStudName= objScanner.nextLine();
          	
          	System.out.println("Enter Father Name: ");
          	objScanner = new Scanner(System.in);
          	sfName = objScanner.nextLine();
          	
          	System.out.println("Enter Mother Name: ");
          	objScanner = new Scanner(System.in);
          	smName = objScanner.nextLine();
          	
          	System.out.println("Enter Grade: ");
          	objScanner = new Scanner(System.in);
          	sGrade= objScanner.nextLine();
          	
          	System.out.println("Enter Attendance: ");
          	objScanner = new Scanner(System.in);
          	sAttendance = objScanner.nextInt();
          	
          	sms.addStudent(new Student(iStudId, sStudName,sfName,smName, sGrade,sAttendance));
          	System.out.println("Record added successfully.");

          	// Read and display students
            System.out.println("Students List:");
            sms.viewStudents();
    		break;

    	case 2: //Updating Existing Student
    		System.out.println("Enter Student Id :");
        	objScanner = new Scanner(System.in);
          	iStudId = objScanner.nextInt();
          	
          	//Check the existence of the record
          	Student foundStudenttoUpdate = sms.searchStudentById(iStudId);
          	if(foundStudenttoUpdate==null)
          	{
          		System.out.println("Record not found...exiting");
          		break;
          	}
          	  
          	System.out.println("Enter Student Name: ");
          	objScanner = new Scanner(System.in);
          	sStudName= objScanner.nextLine();
          	  
          	System.out.println("Enter Father Name: ");
          	objScanner = new Scanner(System.in);
          	sfName = objScanner.nextLine();
          	
          	System.out.println("Enter Mother Name: ");
          	objScanner = new Scanner(System.in);
          	smName = objScanner.nextLine();
          	
          	System.out.println("Enter Grade: ");
          	objScanner = new Scanner(System.in);
          	sGrade= objScanner.nextLine();
          	
          	System.out.println("Enter Attendance: ");
          	objScanner = new Scanner(System.in);
          	sAttendance = objScanner.nextInt();
          	
          	sms.updateStudent(iStudId, sStudName,sfName, smName, sGrade, sAttendance);
          	System.out.println("Record updated successfully.");
          	// Read and display students
            System.out.println("Students List:");
            sms.viewStudents();
    		break;
    		
    	case 3: //Delete existing student
    		System.out.println("Enter Student Id :");
        	objScanner = new Scanner(System.in);
          	iStudId = objScanner.nextInt();

          	//Check the existence of the record
          	Student foundStudenttoDelete = sms.searchStudentById(iStudId);
          	if(foundStudenttoDelete==null)
          	{
          		System.out.println("Record not found...exiting");
          		break;
          	}

          	sms.deleteStudent(iStudId);
            System.out.println("Record deleted successfully.");
            System.out.println("Students List:");
            sms.viewStudents();    		
    	}
    }
}