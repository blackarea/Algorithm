package algorithm.BOJ10k;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10451 {
    static int map[][];
    static boolean visit[];
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine()); //st.nextToken()

        int tc = Integer.parseInt(br.readLine());

        for (int t = 0; t < tc; t++) {
            n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            map = new int[n + 1][n + 1];
            visit = new boolean[n + 1];

            for (int i = 1; i <= n; i++) {
                int x = i;
                int y = Integer.parseInt(st.nextToken());

                map[x][y] = map[y][x] = 1;
            }

            int count = 0;

            for (int i = 1; i < n + 1; i++) {
                if (visit[i] == false) {
                    dfs(i);
                    count++;
                }
            }

            System.out.println(count);
        }


    }

    public static void dfs(int i) {
        visit[i] = true;

        for (int j = 1; j <= n; j++) {
            if (map[i][j] == 1 && visit[j] == false) {
                dfs(j);
            }
        }
    }
}
