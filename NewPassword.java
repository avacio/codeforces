package ACCEPTED;

// Question from:
// http://codeforces.com/problemset/problem/770/A

// VERDICT: Accepted

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NewPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer length = sc.nextInt();
        Integer numDistinct = sc.nextInt();
        List<Character> distincts = new ArrayList<Character>();

        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');

        String password = "";
        while (length != 0) {
            if (password.length() == 0) {
                password+=c;
                distincts.add(c);
                numDistinct--;
            } else
            {if (numDistinct == 0) {
                for (Character x : distincts) {
                    if (x != password.charAt(password.length()-1)) {
                        password+=x;
                        break;}}}
            else {
                while (c == password.charAt(password.length()-1) ||
                        distincts.contains(c)) {
                    c =(char)(r.nextInt(26) + 'a');
                }
                password+=c;
                distincts.add(c);
                numDistinct--;
            }
            }
            length--;
        }
        System.out.println(password);
    }
}
