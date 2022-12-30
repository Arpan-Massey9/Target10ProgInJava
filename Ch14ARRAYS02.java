// Updation in array

package codingjourneystart;
import java.util.Scanner;
public class Ch14ARRAYS02 {
    public static void improvement(int score[]){
        for(int i=0; i<score.length; i++){
            score[i]= score[i]+20;
        }
    }
    public static void main(String[] args) {
        int score[] = new int[5];
        // input
        Scanner sc = new Scanner(System.in);
        System.out.println("Alert! Only put less than 30");
        System.out.print("Enter GS Score: " + " ");
        score[0] = sc.nextInt();
        System.out.print("Enter Maths Score: " + " ");
        score[1] = sc.nextInt();
        System.out.print("Enter Reasoning Score: " + " ");
        score[2] = sc.nextInt();
        System.out.print("Enter English Score: " + " ");
        score[3] = sc.nextInt();
        System.out.println();

        // output Before improvement
        System.out.println("Before improvement: ");
        System.out.println();
        System.out.println("Score of GS is: " + score[0]);
        System.out.println("Score of Maths is: " + score[1]);
        System.out.println("Score of Reasoning is: " + score[2]);
        System.out.println("Score of English is: " + score[3]);
        System.out.println();

        // fun call
        improvement(score);

        // output After improvement
        System.out.println("After improvement: ");
        System.out.println();
        System.out.println("Score of GS is: " + score[0]);
        System.out.println("Score of Maths is: " + score[1]);
        System.out.println("Score of Reasoning is: " + score[2]);
        System.out.println("Score of English is: " + score[3]);

    }

}
