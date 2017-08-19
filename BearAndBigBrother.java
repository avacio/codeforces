package ACCEPTED;

// Question from:
// http://codeforces.com/problemset/problem/791/A

// VERDICT: Accepted

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] weights = line.split(" ");

        Integer Limak = Integer.valueOf(weights[0]);
        Integer Bob = Integer.valueOf(weights[1]);

        Integer yearsPassed = 0;
        while (Limak <= Bob) {
            yearsPassed++;
            Limak = Limak * 3;
            Bob = Bob * 2;
        }

        System.out.println(yearsPassed);
    }
}
