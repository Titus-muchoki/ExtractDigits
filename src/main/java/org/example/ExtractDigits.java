package org.example;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be extracted: ");
        int n = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println(n % 10);
            n /= 10;

    }
        System.out.println();
    int number2 = 12345;
    String s = "" + number2;
    for(int i = 0; i<s.length(); i++)

    {
        int t = Integer.parseInt(s.charAt(i) + "");
        System.out.println(t);
    }
}
}

