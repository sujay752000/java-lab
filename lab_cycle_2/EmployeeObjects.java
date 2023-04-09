package lab_cycle_2;
import java.util.Scanner;

class Employee{
    String e_number, e_name;
    int e_salary;

    public Employee(String name, String num, int salary){
        this.e_name = name;
        this.e_number = num;
        this.e_salary = salary;
    }

    public void display_employee(){
        System.out.printf("\n\tEmployee Name = %s\n\tEmployee Id = %s\n\tEmployee Salary = %d\n", this.e_name, this.e_number, this.e_salary);
    }
}

public class EmployeeObjects {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int total_emp;
        System.out.printf("How many Employee you want to create : ");
        total_emp = sc.nextInt();

        Employee emp_arr[] = new Employee[total_emp];

        for(int i = 0; i < total_emp; i++){
            System.out.printf("\n\nEnter your details for %d employee : ", i + 1);
            System.out.printf("\n\tEnter Employee Salary : ");
            int emp_salary = sc.nextInt();
            sc.nextLine();
            System.out.printf("\n\tEnter Employee Nmae : ");
            String emp_name = sc.nextLine();
            System.out.printf("\n\tEnter Employee ID : ");
            String emp_id = sc.nextLine();

            emp_arr[i] = new Employee(emp_name, emp_id, emp_salary);
        }

        while(true){
            System.out.printf("\n1 - To Display details of all employees\n2 - Search a Employee ID\n3 - Exit\nYour Choice : ");
            int usr_choice = sc.nextInt();
            if(usr_choice == 1){
                for(int i = 0; i < total_emp; i++){
                    System.out.printf("\n\nDetails of %d Employee is : ", i + 1);
                    emp_arr[i].display_employee();
                }
            }
            else if(usr_choice == 2){
                System.out.printf("\nEnter a Employee ID to search : ");
                String emp_id = sc.next();
                int flag = 0;
                for(int i = 0; i < total_emp; i++){
                    if(emp_id.compareTo(emp_arr[i].e_number) == 0){
                        flag = 1;
                        System.out.printf("\n\t%s has Employee ID %s\n", emp_arr[i].e_name, emp_id);
                    }
                }
                if(flag == 0){
                    System.out.println("\n\tEmployee Not Created !");
                }
            }
            else if(usr_choice == 3){
                System.out.println("\n\tYou are Exited !\n");
                break;
            }
            else{
                System.out.println("\n\tInvalid Choice\n");
            }
        }
    }
}
