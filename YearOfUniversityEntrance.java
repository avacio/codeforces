package ACCEPTED;

// Question from:
// http://codeforces.com/problemset/problem/769/A

// VERDICT: Accepted

import java.util.*;

public class YearOfUniversityEntrance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String[] array = line.split(" ");
        List<String> strings = Arrays.asList(array);
        List<Integer> years = new ArrayList<Integer>();
        for (String s : strings) {
            years.add(Integer.valueOf(s));
        }

        Collections.sort(years);
        Integer entranceYear = 0;
        switch (num) {
            case 1:
                entranceYear = years.get(0);
                break;
            case 3:
                entranceYear = years.get(1);
                break;
            case 5:
                entranceYear = years.get(2);
                break;
        }
        System.out.println(entranceYear);
    }
}
