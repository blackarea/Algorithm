package algorithm.BOJ;

import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BOJ_5620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * 못품!
         */

        int n = Integer.parseInt(br.readLine());
        Point[] point = new Point[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(point, (o1, o2) -> o1.x - o2.x);

        // y 좌표를 기준으로 오름차순 정렬하되, y 좌표가 같다면 x 좌표를 기준으로 오름차순 정렬.
        // set 사용하는 이유 : 한 번 탐색한 점은 또 탐색하지 않기 위해서.
        TreeSet<Point> set = new TreeSet<>((p1, p2) -> ((p1.y == p2.y) ? p1.x - p2.x : p1.y - p2.y));


    }
}
