// BOTH BRUTE FORCE & EFFICIENT WAY TO TAKE INPUT AND PRINT OUTPUT IN ARRAY

package codingjourneystart;
import java.util.Scanner;
public class Ch14ARRAYS04 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = input.nextInt();
        System.out.println("Enter elements: ");
        int []array = new int[5];
        // for taking input of array elements
       /* array[0] = input.nextInt();
        array[1] = input.nextInt();
        array[2] = input.nextInt();
        array[3] = input.nextInt();
        array[4] = input.nextInt(); */
        for(int i=0; i< array.length;i++){
            array[i] = input.nextInt();
        }
        System.out.println();
        // for showing output of array element
        /*  System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]); */
        for(int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
}
