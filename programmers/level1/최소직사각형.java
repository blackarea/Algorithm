package algorithm.programmers.level1;

public class 최소직사각형 {
    public static void main(String[] args) {

        solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
    }

    public static int solution(int[][] sizes) {
        int answer = 0;

        int maxWidth = 0;
        int maxLength = 0;
        int min = 0;

        for (int[] size : sizes) {
            maxWidth = Math.max(maxWidth, size[0]);
            maxLength = Math.max(maxLength, size[1]);
            min = Math.max(min, Math.min(size[0], size[1]));
        }

        answer = Math.max(maxWidth, maxLength) * min;

        return answer;
    }
}
