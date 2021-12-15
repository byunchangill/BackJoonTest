package beakjoon.forStatement;

import java.io.*;

public class ReverseContinuousOutput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        for (int i = num; i >= 1; i--) {
            bw.write(i + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
