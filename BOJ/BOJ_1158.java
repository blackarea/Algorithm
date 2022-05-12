package algorithm.BOJ;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String[] s1 = s.split(" ");
        int N = Integer.parseInt(s1[0]);
        int K = Integer.parseInt(s1[1]);

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int[] arr = new int[N];
        int i = 0;

        while (!queue.isEmpty()) {
            for (int j = 0; j < K - 1; j++) {
                queue.add(queue.remove());
            }
            arr[i++] = queue.remove();
        }

        System.out.print("<");
        for (int j = 0; j < N - 1; j++) {
            System.out.print(arr[j] + ", ");
        }
        System.out.print(arr[N - 1]);
        System.out.print(">");


    }
}
