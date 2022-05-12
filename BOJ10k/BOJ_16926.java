package algorithm.BOJ10k;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int[][] temp = new int[n][m];
        int[][] result = new int[n][m];
        int x = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int k = 0; k < r; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    x = Math.min(Math.min(i, (n - 1) - i), Math.min(j, (m - 1) - j));
                    if (i == x && j - 1 >= x) { //2,3,4
                        temp[i][j - 1] = arr[i][j];
                    } else if (i + 1 < n - x && j == x) {  //1,5,9
                        temp[i + 1][j] = arr[i][j];
                    } else if (i == (n - 1) - x && j + 1 < m - x) {
                        temp[i][j + 1] = arr[i][j];
                    } else if (i - 1 >= x&& j == (m - 1) - x) {
                        temp[i - 1][j] = arr[i][j];
                    }

                }
            }
            arr = temp;
            result = temp;
            temp = new int[n][m];
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }
}
