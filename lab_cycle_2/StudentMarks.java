package lab_cycle_2;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total_sub;
        float total_marks = 0, total_percent;

        System.out.printf("Enter the total no : of subjects : ");
        total_sub = sc.nextInt();

        float marks[] = new float[total_sub];
        for(int i = 0; i < total_sub; i++){
            while(true){
                System.out.printf("\nPlease enter your marks for %d subject out of 100 : ", i+1);
                float sub_mark = sc.nextFloat();
                if(sub_mark >= 0 && sub_mark <= 100){
                    marks[i] = sub_mark;
                    total_marks = total_marks + marks[i];
                    break;
                }
                else{
                    System.out.println("Invalid Mark! Enter again \n");
                }
            }
        }
        System.out.printf("\nTotal Marks = %.2f", total_marks);
        total_percent = (total_marks / (total_sub * 100)) * 100;
        System.out.printf("\nTotal Percentage = %.2f ", total_percent);


    }
}
