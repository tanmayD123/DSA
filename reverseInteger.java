package com.company;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int ans = 0;

        while(n!=0)
        {
            int digit = n % 10;
            ans = (ans * 10) + digit;
            n = n / 10;
        }

        System.out.println("Reverse is: " + ans);
    }


}
