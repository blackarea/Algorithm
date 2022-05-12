package algorithm.BOJ;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BOJ_2667 {
    private static int dx[] = {-1, 1, 0, 0};
    private static int dy[] = {0, 0, -1, 1};
    static int map[][];
    static boolean visit[][];
    static int n , count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visit = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String temp = br.readLine();

            for (int j = 0; j < n; j++) {
                map[i][j] = temp.charAt(j) - '0';
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && visit[i][j] == false) {
                    count = 1;
                    dfs(i, j);
                    list.add(count);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (Integer li : list) {
            System.out.println(li);
        }


    }

    public static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                if (map[nx][ny] == 1 && visit[nx][ny] == false) {
                    dfs(nx, ny);
                    count++;
                }
            }
        }
    }
}
