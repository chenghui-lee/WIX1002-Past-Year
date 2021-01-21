import java.util.Scanner;
// Filename: Q1.java
public class Q1 {
	public static void main(String[] arg){
		System.out.println("This program changes all the odd numbers in the array into even numbers.");
		Scanner s = new Scanner(System.in); // Err 1
		int size = 5;
		int num[] = new int[size]; // Err 2
		System.out.print("Enter five integer numbers: ");
		for(int i=0; i<size; i++){ // Err 3
			num[i] = s.nextInt(); // Err 4
		}
		convert(num); // Err 5
		System.out.print("The numbers are: ");
		for(int i=0; i<size; i++){
			System.out.print(num[i] + " "); // Err 10
		}
		System.out.println("");
	}
	public static void convert(int[] a){ // Err 9
		for(int i=0; i<a.length; i++){ // Err 6
			if (a[i]%2==1) // Err 7
				a[i] += 1; // Err 8
		}
	}
}
