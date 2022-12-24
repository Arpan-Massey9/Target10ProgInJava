// CHECK NO IS POSITIVE OR NEGATIVE

package codingjourneystart;
import java.util.Scanner;
public class Ch9CondStatements05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0)
            System.out.println("You entered 0 which is neither positive or negative");
        else if(num<0)
            System.out.println(num+" is NEGATIVE NUMBER");
        else
            System.out.println(num+" is POSITIVE NUMBER");
    }

}
