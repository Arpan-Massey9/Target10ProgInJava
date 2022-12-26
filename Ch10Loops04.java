//  PRINT REVERSE OF GIVEN NUMBER

package codingjourneystart;
import java.util.Scanner;
public class Ch10Loops04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of no: ");
        int no = sc.nextInt();
        while(no>0){
            int lastDigit = no%10;
            System.out.print(lastDigit);
            no=no/10;
        }
    }
}
