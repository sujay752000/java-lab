import java.util.Scanner;

public class MatrixAddition {
    int m, n;
    int a[][];
    int b[][];
    int c[][];

    Scanner s = new Scanner(System.in);

    void setValue() {
        System.out.println("Enter size of the matrix : ");
        m = s.nextInt();
        n = s.nextInt();

        a = new int[m][n];
        b = new int[m][n];
        c = new int[m][n];
    }

    void setMatrix() {
        System.out.println("Enter values of first matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter values of second matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = s.nextInt();
            }
        }
    }

    void addMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Resultant matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        MatrixAddition obj = new MatrixAddition();
        obj.setValue();
        obj.setMatrix();
        obj.addMatrix();
    }
}
