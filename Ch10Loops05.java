// REVERSE THE ORIGINAL NUMBER

package codingjourneystart;
import java.util.Scanner;
public class Ch10Loops05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int rev =0;
        while(n>0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n=n/10;
        }
        System.out.println(rev);
    }
}
