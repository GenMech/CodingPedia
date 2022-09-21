package com.company;
import org.jetbrains.annotations.NotNull;

import java.util.*;
public class JumpingOnTiles {

    static class Pair implements Comparable<Pair> {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {
            return o.x - this.x;
        }
    }

    private static void solve(@NotNull String s) {
        int n = s.length();
        if (s.charAt(0) < s.charAt(n - 1)) {
            int amount = s.charAt(n - 1) - s.charAt(0);
            int min = 2;
            ArrayList<Pair> ls = new ArrayList<>();

            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i) >= s.charAt(0) && s.charAt(i) <= s.charAt(n - 1)) {
                    min++;
                    ls.add(new Pair(s.charAt(i) - 'a' + 1, i + 1));
                }
            }
            Collections.sort(ls, Collections.reverseOrder());
            System.out.println(amount + " " + min);
            System.out.print(1 + " ");
            for (Pair p : ls) {
                System.out.print(p.y + " ");
            }
            System.out.print(n + " ");
            System.out.println();
        } else if (s.charAt(0) > s.charAt(n - 1)) {
            int amount = s.charAt(0) - s.charAt(n - 1);
            int min = 2;
            ArrayList<Pair> ls = new ArrayList<>();

            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i) <= s.charAt(0) && s.charAt(i) >= s.charAt(n - 1)) {
                    min++;
                    ls.add(new Pair(s.charAt(i) - 'a' + 1, i + 1));
                }
            }
            Collections.sort(ls);
            System.out.println(amount + " " + min);
            System.out.print(1 + " ");
            for (Pair p : ls) {
                System.out.print(p.y + " ");
            }
            System.out.print(n + " ");
            System.out.println();
        } else {
            int amount = 0;
            int min = 1;
            ArrayList<Integer> ls = new ArrayList<>();
            ls.add(1);
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(0)) {
                    min++;
                    ls.add(i + 1);
                }
            }
            System.out.println(amount + " " + min);
            for (int x : ls) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}