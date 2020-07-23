package examples.simple;

import java.util.Scanner;
import java.util.Random;
public class FunctionReview {
    public static void main(String[] args) {
        var sum = 0;
        var sum2 = 0;
        var timesexedded = 0;
        System.out.println("Choose a threshold between 0 and 100");
        var scanner = new Scanner(System.in);
        var threshold = scanner.nextInt();
        scanner.close();

        for (var i = 0; i < 21; i++) {
            float tempnum = new Random().nextInt(100)+1;
            sum2+=tempnum;
            if (tempnum > threshold) {
                System.out.println(tempnum);
                sum+=tempnum;
                timesexedded++;
            }
        }
        System.out.println("Average:" + sum/timesexedded);
        System.out.println("Average 2:" + sum2/20 );
    }
}
