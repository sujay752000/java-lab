
import java.util.Scanner;

class Employee {
    String emp_name, emp_address, emp_id;
    int emp_salary;

    public Employee(String id, String name, String address, int salary) {
        this.emp_id = id;
        this.emp_name = name;
        this.emp_address = address;
        this.emp_salary = salary;
    }

    public void display_employee() {
        System.out.printf("Details are : \n");
        System.out.printf(
                "\n\tEmployee Name = %s\n\tEmployee Id = %s\n\tEmployee Salary = %d\n\tEmployee address = %s\n",
                this.emp_name, this.emp_id, this.emp_salary, this.emp_address);
    }
}

class Teacher extends Employee {

    String emp_dept, emp_subjects;

    public Teacher(String id, String name, String address, int salary, String dept, String subjects) {
        super(id, name, address, salary);
        this.emp_dept = dept;
        this.emp_subjects = subjects;
    }

    public void display_teacher() {
        System.out.printf("Details are :");
        System.out.printf(
                "\n\t Name = %s\n\t Id = %s\n\t Department = %s\n\t Subjects Taught = %s\n\t Salary = %d\n\t Address = %s\n\n",
                this.emp_name, this.emp_id, this.emp_dept, this.emp_subjects, this.emp_salary, this.emp_address);
    }
}

public class TeacherInherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many Teachers you want to add : ");
        int total_emp = sc.nextInt();

        Teacher emp_arr[] = new Teacher[total_emp];

        for (int i = 0; i < total_emp; i++) {
            System.out.printf("\n\nEnter your details for %d employee : ", i + 1);
            System.out.printf("\n\tEnter Employee Name : ");
            sc.nextLine();
            String emp_name = sc.nextLine();
            System.out.printf("\n\tEnter Employee ID : ");
            String emp_id = sc.nextLine();
            System.out.printf("\n\tEnter Employee Department : ");
            String emp_dept = sc.nextLine();
            System.out.printf("\n\tEnter Employee Subjects : ");
            String emp_subs = sc.nextLine();
            System.out.printf("\n\tEnter Employee address : ");
            String emp_addr = sc.nextLine();
            System.out.printf("\n\tEnter Employee Salary : ");
            int emp_salary = sc.nextInt();

            emp_arr[i] = new Teacher(emp_id, emp_name, emp_addr, emp_salary, emp_dept, emp_subs);
        }

        for (int i = 0; i < total_emp; i++) {
            System.out.printf("\nEmployee - %d ", i + 1);
            emp_arr[i].display_teacher();
        }
    }
}
