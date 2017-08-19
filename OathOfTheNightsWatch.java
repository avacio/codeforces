package ACCEPTED;

// Question from:
// http://codeforces.com/problemset/problem/768/A

// VERDICT: Accepted

import java.util.*;

public class OathOfTheNightsWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        Integer num = Integer.valueOf(line);
        line = sc.nextLine();

        String[] strengths = line.split(" ");
        List<String> list = Arrays.asList(strengths);
        List<Integer> ints = new ArrayList<Integer>();
        for (String s : list) {ints.add(Integer.valueOf(s));}
        Collections.sort(ints);

        Integer toFeed;
        if (num < 3) { toFeed = 0;}
        else {
            toFeed = num - 2;
            for (int i=1; i < ints.size()-1; i++) {
                if (ints.get(0).equals(ints.get(i)) ||
                        ints.get(num-1).equals(ints.get(i))) {toFeed--;}
            }
        }
        System.out.println(toFeed);
    }
}
