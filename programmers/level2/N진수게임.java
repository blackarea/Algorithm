package algorithm.programmers.level2;

public class N진수게임 {
    public static void main(String[] args) {

        solution(2, 4, 2, 1);
    }

    public static String solution(int n, int t, int m, int p) {
        String answer = "";

        int index = 0;
        int loop = 0;
        StringBuilder sb = new StringBuilder();

        while (answer.length() < t) {
            if (sb.toString().equals("")) {
                sb.append(Integer.toString(index++, n));
            } else {
                if ((loop++% m) + 1 == p) {
                    answer += sb.charAt(0);
                }
                sb.deleteCharAt(0);
            }
        }
        answer = answer.toUpperCase();

        return answer;
    }
}
