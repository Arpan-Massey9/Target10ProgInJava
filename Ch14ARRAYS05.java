// Updation in array in efficient way or example of call by value and call by reference

package codingjourneystart;
import java.util.Scanner;
public class Ch14ARRAYS05 {
    public static void update(int array[], int nonchangable) {
        //  change/update occur in update fun but reflect in another fun i.e. main() coz array did call by ref
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1; // update value by 1
        }
        // change/update occur in update fun but doesn't reflect in another fun i.e. main() coz var did call by value
        nonchangable = nonchangable+1;
    }

    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array or n's value: ");
        n = sc.nextInt();
        int[] array = new int[n]; // creation of array which take call by reference
        System.out.println("Enter vale of element which want to update: ");
        int nonchangable = sc.nextInt(); // creation of variable which take call by value
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");

        // fun call
        update(array, nonchangable);
        // to print on output console
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("value of nonchangable element is : " + nonchangable);
    }
}
