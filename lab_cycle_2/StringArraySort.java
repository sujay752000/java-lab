package lab_cycle_2;
import java.util.Scanner;

public class StringArraySort {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the no : of strings you want to enter : ");
        int total_str = sc.nextInt();

        String arr[] = new String[total_str];

        for(int i = 0 ; i < total_str; i++){
            System.out.printf("\nEnter your %d string : ", i + 1);
            arr[i] = sc.next();
        }

        System.out.println("\nYour Entered String Array : ");
        for(int i = 0 ; i < total_str; i++){
            System.out.printf("%s\t", arr[i]);
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i].compareTo(arr[j]) < 0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        System.out.println("\nYour Sorted String Array : ");

        for(int i = 0; i < arr.length; i++){
            System.out.printf("%s\t", arr[i]);
        }
    }
    
}
