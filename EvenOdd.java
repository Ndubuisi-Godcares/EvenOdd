import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Declare the even and odd arrays
        int[] even = new int[size];
        int[] odd = new int[size];
        
        // Read the numbers from the user and move them to respective arrays
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            
            if (number % 2 == 0) {
                even[i] = number;
            } else {
                odd[i] = number;
            }
        }
        
        // Print the even array
        System.out.print("Even array: ");
        for (int i = 0; i < size; i++) {
            if (even[i] != 0) {
                System.out.print(even[i] + " ");
            }
        }
        System.out.println();
        
        // Print the odd array
        System.out.print("Odd array: ");
        for (int i = 0; i < size; i++) {
            if (odd[i] != 0) {
                System.out.print(odd[i] + " ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}
