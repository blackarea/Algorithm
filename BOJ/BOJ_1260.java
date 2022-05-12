package algorithm.BOJ;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1260 {
    static int map[][];
    static boolean visit[];
    static int n, m, start;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        map = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            map[x][y] = map[y][x] = 1;
        }

        dfs(start);

        visit = new boolean[n+1];
        System.out.println();
        bfs();
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visit[start] = true;
        System.out.print(start + " ");

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 1; i <= n; i++) {
                if (map[temp][i] == 1 && visit[i] == false) {
                    queue.offer(i);
                    visit[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void dfs(int i) {
        visit[i] = true;
        System.out.print(i + " ");

        for (int j = 1; j <= n; j++) {
            if (map[i][j] == 1 && visit[j] == false) {
                dfs(j);
            }
        }
    }
}
