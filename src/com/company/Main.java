package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String dash = "";
        int num = inputInt("What is the max stars you want?");

        num = checkNum(num);

        printDashes(num, dash);
    }

    public static void printDashes(int num, String dash)
    {
        for (int i = 2; i <= num; i = i + 2) {
            dash = getDashes(dash, 2);
            print(dash);
        }
    }


    public static int checkNum(int num)
    {
        while (num > 100 || num < 0)
        {
            num = inputInt("Choose between 0 and 100");
        }
        if (num%2 == 0 )
        {
            return num;
        }
        else
        {
            return num+1;
        }
    }
    public static String getDashes(String d, int i)
    {
        for (int j = 0; j < i; j++) {
            d = d + "*";
        }

        return d;
    }

    public static void print(String m)
    {
        System.out.println(m);
    }

    public static int inputInt(String m) {
        int answer;
        Scanner scanner = new Scanner(System.in);

        print(m);
        answer = scanner.nextInt();
        return answer;
    }
}
