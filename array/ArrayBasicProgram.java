import java.util.Scanner;

public class ArrayBasicProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

	System.out.println("Enter Array Elements:");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
	
	System.out.println("Array Elements are: ");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}