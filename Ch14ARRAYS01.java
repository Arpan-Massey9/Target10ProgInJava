// how to take input and output in array

package codingjourneystart;
import java.util.Scanner;
public class Ch14ARRAYS01 {
    public static void main(String[] args) {
      // creation of array and memory allocation of array
      int marks[] = new int[100];
      // taking input as marks
        Scanner sc = new Scanner(System.in);
      //int phy;
      //phy = sc.nextInt();
      // similary take in array
        System.out.println("Enter phy marks: ");
        marks[0] = sc.nextInt();  // phy marks
        System.out.println("Enter chem marks: ");
        marks[1] = sc.nextInt();  // chem marks
        System.out.println("Enter maths marks: ");
        marks[2] = sc.nextInt();  // maths marks
      // output

        System.out.println("phy marks is "+ marks[0]);
        System.out.println("chem marks is "+ marks[1]);
        System.out.println("maths marks is "+ marks[2]);

    }
}
