package org.example;

public class Main {
    public static void main(String[] args) {
        String s1 = "aabcad";
        String s2 = "xdcaay";
        int sum = new CommonLetterCounter(s1, s2).getSumOfCommonLetters();
        System.out.println("Sum: " + sum);
    }
}