package ACCEPTED;

// Question from:
// http://codeforces.com/problemset/problem/796/A

// VERDICT: Accepted

import java.util.ArrayList;
import java.util.Scanner;

public class BuyingAHouse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] line1 = line.split(" ");

        Integer n = Integer.valueOf(line1[0]);
        Integer m = Integer.valueOf(line1[1]); //where the girl lives
        Integer k = Integer.valueOf(line1[2]);

        line = sc.nextLine();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (String s : line.split(" ")) {
            Integer i = Integer.valueOf(s);
            list.add(i);
        }

        Integer smallestDistance = n * 10;

        for (int i = 0; i < list.size(); i++) {
            Integer val = list.get(i);

            if (val != 0 && k >= val) {
                Integer distance = Math.abs(10 * ((i + 1) - m));

                if (distance < smallestDistance) {
                    smallestDistance = distance;
                }
            }
        }

        System.out.println(smallestDistance);
    }
}
