package lab_cycle_2;
import java.util.Scanner;

class Shape{
    float length, breadth, area, radius, side;
    double pi_value;

    public void find_area(float l, float b){
        this.length = l;
        this.breadth = b;
        this.area = this.length * this.breadth;
        System.out.printf("\tArea = %.3f\n\n", this.area);
    }

    public void find_area(Double pi, float r){
        this.radius = r;
        this.pi_value = pi;
        this.area = (float)this.pi_value * this.radius * this.radius;
        System.out.printf("\tArea = %.3f\n\n", this.area);
    }

    public void find_area(float s){
        this.side = s;
        this.area = this.side * this.side;
        System.out.printf("\tArea = %.3f\n\n", this.area);
    }
}

public class MethodOver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Shape rec1 = new Shape();
        System.out.println("Enter details to find area of Rectangle : ");
        System.out.println("Enter the length : ");
        float length = sc.nextFloat();
        System.out.println("Enter the breadth : ");
        float breadth = sc.nextFloat();
        rec1.find_area(length, breadth);


        Shape cir1 = new Shape();
        System.out.println("Enter details to find area of Circle : ");
        System.out.println("Enter the radius : ");
        float radius = sc.nextFloat();
        cir1.find_area(3.14, radius);

        Shape sqr1 = new Shape();
        System.out.println("Enter details to find area of square : ");
        System.out.println("Enter the side : ");
        float side = sc.nextFloat();
        sqr1.find_area(side);
    }
    
}
