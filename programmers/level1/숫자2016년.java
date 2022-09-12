package algorithm.programmers.level1;

public class 숫자2016년 {
    public static void main(String[] args) {

        solution(5, 24);
    }

    public static String solution(int a, int b) {
        String answer = "";
        String[] week = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] dayOfMonth = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int day = b + 4;

        for (int i = 0; i < a - 1; i++) {
            day += dayOfMonth[i];
        }

        answer = week[day % 7];
        System.out.println(answer);

        return answer;
    }
}
