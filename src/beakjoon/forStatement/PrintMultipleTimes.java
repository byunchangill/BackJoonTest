package beakjoon.forStatement;

import java.util.Scanner;

public class PrintMultipleTimes {
    public static void main(String[] args) { // A + B 여러번 출력하기.
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[] = new int[T];
        for (int i = 0; i < T; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            arr[i] = a + b;
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
