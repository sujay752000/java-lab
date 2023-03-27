import java.io.*;
import java.util.Scanner;

public class Student{

	public static void main(String[] args){

		float total_marks = 0, percent;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total no : of subjects :");
		int total_sub = sc.nextInt(); 

		float [] marks = new float[total_sub];

		for(int i = 0; i < total_sub; i++){
			System.out.printf("Enter mark of %d subject : \n", i+1);
			marks[i] = sc.nextFloat();
			total_marks += marks[i];
		}

		percent = (total_marks / (total_sub * 100) ) * 100;
		
		System.out.printf("\nTotal marks = %.2f\nTotal Percentage = %.2f \n", total_marks, percent);

		
	}

}
