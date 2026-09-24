package codesoft;
import java.util.Scanner;
public class Student_Grade_calculator {

	public static void main(String[] args) {
	  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number of subject :"  );
		int n = sc.nextInt();
         int total=0;  
		
		int marks[] = new int[n];
		for(int i=0;i<n;i++) {	
		   System.out.println("Enter marks for subjects "+(i+1)+":");			
		    marks[i]=sc.nextInt();
		    
		    total=total+marks[i];
		}
		
		double avg =(double)total/n;
		
		String grade;
		
		if(avg>=90) {
			grade="A";
		}
		else if(avg>=80) {
			grade="B";
		}
		else if(avg>=70) {
			grade="C";
		}
		else if(avg>=60) {
			grade="D";
		}
		else {
			grade="F";
		}
		
		System.out.println("Total Marks : "+total);
		System.out.println("Average percentage : "+avg + "%");
		System.out.println("Grade : " +grade);
	}

}
