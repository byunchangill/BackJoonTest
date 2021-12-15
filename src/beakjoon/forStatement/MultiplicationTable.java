package beakjoon.forStatement;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) { // 구구단.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
