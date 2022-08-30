import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] testScores = new int[5];
        int avg = 0;
        for (int scores : testScores){
            System.out.println("Enter a score");
            int score = sc.nextInt();
            testScores[scores] = score;
            avg = avg + score;
        }
        avg = avg/5;
        System.out.println("The average is "+avg);


    }

}
