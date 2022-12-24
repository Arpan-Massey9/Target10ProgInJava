// PRINT NUMBER IS EVEN OR ODD

package codingjourneystart;
import java.util.Scanner;
public class Ch9CondStatements02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
            System.out.println(num + " is Even Number");
        else if (num<0)
            System.out.println("please enter positive no to check");
        else
            System.out.println(num + " is Odd Number");
    }

}
