package algorithm.BOJ10k;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[][] = new int[N][2];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            }
            else {
                return e1[0] - e2[0];
            }
        });


        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }



    }
}
