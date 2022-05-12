package algorithm.BOJ;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2606 {
    static int map[][];
    static boolean visit[];
    static int n, m, count;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            map[x][y] = map[y][x] = 1;
        }

        System.out.println(dfs(1));

    }

    public static int dfs(int i) {
        visit[i] = true;

        for (int j = 1; j <= n; j++) {
            if (map[i][j] == 1 && visit[j] == false) {
                dfs(j);
            }
        }
        return count;
    }
}
