import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays declaration and initialization
        int[] array = new int[15];

        // input taken from the user and stored in array
        System.out.println("Enter 15 integer values:");
        for (int f = 0; f < array.length; f++) {
            array[f] = input.nextInt();
        }

        // print the values stored in the array
        System.out.print("Array elements: ");
        for (int f = 0; f < array.length; f++) {
            System.out.print(array[f] + " ");
        }
        System.out.println();

        // check if a number entered by user is present in array or not
        System.out.print("Enter a number to search in array: ");
        int num = input.nextInt();
        boolean found = false;
        for (int f = 0; f < array.length; f++) {
            if (array[f] == num) {
                System.out.println("The number found at index " + f);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        // create another array in reverse order
        int[] reverseArray = new int[array.length];
        for (int f = 0, j = array.length - 1; f < array.length; f++, j--) {
            reverseArray[j] = array[f];
        }

        // print the elements of the new array in reverse order
        System.out.print("Reverse array elements: ");
        for (int f = 0; f < reverseArray.length; f++) {
            System.out.print(reverseArray[f] + " ");
        }
        System.out.println();

        // calculate and print sum and product of all elements of array
        int sum = 0;
        int product = 1;
        for (int f = 0; f < array.length; f++) {
            sum += array[f];
            product *= array[f];
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}

