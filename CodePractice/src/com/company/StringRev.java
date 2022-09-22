package com.company;

public class StringRev {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String[] s1 = s.split("\\s");
        String revWord = " ";
        for(String w: s1){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            revWord += sb.toString() + ' ';
        }
        System.out.println(revWord.trim());
    }
}
