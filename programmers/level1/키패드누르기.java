package algorithm.programmers.level1;

public class 키패드누르기 {
    public static void main(String[] args) {

        solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";

        int leftP = 10;
        int rightP = 12;
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                leftP = num;
                answer += "L";
            } else if (num == 3 || num == 6 || num == 9) {
                rightP = num;
                answer += "R";
            } else {
                if (num == 0) num = 11;
                int leftDistance = Math.abs(num - leftP) / 3 + Math.abs(num - leftP) % 3;
                int rightDistance = Math.abs(num - rightP) / 3 + Math.abs(num - rightP) % 3;

                if (leftDistance < rightDistance) {
                    leftP = num;
                    answer += "L";
                } else if (leftDistance > rightDistance) {
                    rightP = num;
                    answer += "R";
                } else {
                    if (hand.equals("left")) {
                        leftP = num;
                        answer += "L";
                    } else {
                        rightP = num;
                        answer += "R";
                    }
                }

            }
        }

        return answer;
    }

}
