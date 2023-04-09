package lab_cycle_2;
import java.util.Scanner;

public class ElementSearch{

	public static void main(String[] args){
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the size of array you want to create : ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i = 0; i < size; i++){
			System.out.printf("Enter the %d element : \n", i);
			arr[i] = sc.nextInt();
		}

		System.out.printf("Enter the key to be searched : ");
		int key = sc.nextInt();
		
		for(int i = 0; i < size; i++){
			if(arr[i] == key){
				System.out.printf("%d found at %d position \n", key, i);
				flag = 1;
			}
		}

		if(flag == 0){
			System.out.printf("%d not found !\n", key);
		}

	}
}