package beakjoon.forStatement;

import java.util.Scanner;

public class SumTotal {
    public static void main(String[] args) { // 합계.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
