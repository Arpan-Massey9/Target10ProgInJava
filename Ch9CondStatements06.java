// YOU HAVE A FEVER IF YOUR TEMPERATURE IS ABOVE THAN 100 OTHERWISE NOT WRITE PROG ON IT

package codingjourneystart;
import java.util.Scanner;
public class Ch9CondStatements06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you body temperature");
        double temp = sc.nextDouble();
        if(temp>100)
            System.out.println("You have a fever");
        else
            System.out.println("You don't have a fever");
    }

}
