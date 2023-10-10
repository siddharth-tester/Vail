import java.util.Scanner;

public class VailAssignment {

	public static void main(String[] args) {

		/**
		 * Reading the input from user for the position value.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the position value = ");
		int position = scan.nextInt();

		/**
		 * This is the array to be rotated.
		 */
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };

		/**
		 * Validating if the position value is negative.
		 */
		if (position < 0) {
			System.out.println("Position value should be positive.");
		} else {
			for (int i = 0; i < position; i++) {
				int first = a[0];
				int j;
				for (j = 0; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
				a[j] = first;
			}
			/**
			 * Printing the array after rotation.
			 */
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
		}

	}

}
