// PRINT A STUDENT FAIL OR PASS

package codingjourneystart;
import java.util.Scanner;
public class Ch9CondStatements04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1marks = sc.nextInt();
        int sub2marks = sc.nextInt();
        int sub3marks = sc.nextInt();
        int sub4marks = sc.nextInt();
        int sub5marks = sc.nextInt();
        float percentage = (sub1marks+sub2marks+sub3marks+sub4marks+sub5marks)/5;
        if(percentage<=33)
            System.out.println(percentage+"% ALAIS! YOU ARE FAIL");
        else
            System.out.println(percentage+"% HURREY! YOU ARE PASS");
    }
}
