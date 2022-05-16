package algorithm.programmers.level1;

//https://programmers.co.kr/learn/courses/30/lessons/17682
public class 다트게임 {
    public static void main(String[] args) {
        System.out.println(solution("1D2S#10S"));
    }

    public static int solution(String dartResult) {
        int answer = 0;
        int[] number = new int[3];
        int part = -1; //0, 1, 2

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                if (48 <= dartResult.charAt(i + 1) && dartResult.charAt(i + 1) <= 57) {
                    number[++part] = 10;
                    i++;
                    continue;
                }
                number[++part] = c - 48;
            } else if (c == 'D') {
                number[part] = (int) Math.pow(number[part], 2);
            } else if (c == 'T') {
                number[part] = (int) Math.pow(number[part], 3);
            } else if (c == '*') {
                if (part != 0) {
                    number[part - 1] *= 2;
                }
                number[part] *= 2;
            } else if (c == '#') {
                number[part] *= -1;
            }
        }
        answer = number[0] + number[1] + number[2];
        return answer;
    }
}
