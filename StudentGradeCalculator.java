package task_1;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects: ");
		int subject = sc.nextInt();
		int []marks = new int [subject];
		int totalMarks=0;
		for(int i=0;i<subject;i++) {
			System.out.print("Enter the marks obtained out 100 in subject "+(i+1)+":");
	        int score = sc.nextInt();
	        if(score<=100) {
	        	//storing subject marks in array
	        	marks[i]=score;
	        	//calculate total marks
	        	totalMarks+=marks[i];
	        }
	        else{     
	        	System.out.println("!!!PLEASE ENTER THE VALID MARKS!!!");
	        	i--;
	        }
		}
		sc.close();
		//calculate average percentage
		float AvgPercentage = (float) totalMarks/subject;
		
		String grade;
		
		switch((int)(AvgPercentage/10)) {
		case 10:
			grade="A+";
		    break;
		case 9:
			grade="A";
			break;
		case 8:
			grade="B+";
			break;
		case 7:
			grade="B";
			break;
		case 6:
			grade="C";
			break;
		case 5:
			grade="D";
			break;
		case 4:
			grade="Pass";
			break;
		default:
			grade="Fail";
			break;
		}
		System.out.println("TotalMarks: "+totalMarks+"/"+subject*100);
		System.out.println("Average Percentage: "+AvgPercentage);
		System.out.println("Grade: "+grade);
		
	}

}
