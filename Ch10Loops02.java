// PRINT NUMBERS 1 TO N

package codingjourneystart;
import java.util.Scanner;
public class Ch10Loops02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
            System.out.println(i);
    }
}
