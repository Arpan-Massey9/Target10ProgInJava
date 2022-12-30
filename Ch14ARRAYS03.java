// how to take input and output in array in efficient way

package codingjourneystart;
import java.util.Scanner;
public class Ch14ARRAYS03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // take input as a size of array
        System.out.println("Enter the size of array or n's value: ");
        n = sc.nextInt(); // reading the input size of array
        int []array = new int[n]; // taking input as array
        System.out.println("Enter elements of array: ");
        for(int i=0; i< array.length; i++){  // traverse array till length on each index
            array[i] = sc.nextInt(); // reading the array elements
        }
        System.out.println("Array elements are: ");
        for(int i=0; i< array.length; i++){ // to print on output console or output of array
            System.out.println(array[i]); // print each element one by one
        }
    }
}
