package algorithm.programmers.level1;

public class 크기가작은부분문자열 {
    public static void main(String[] args) {

        solution("500220839878", "7");
    }

    public static int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            //사전순 비교
            if (t.substring(i, i + p.length()).compareTo(p) <= 0) {
                answer++;
            }
        }

        System.out.println(answer);

        return answer;
    }
}
