package algorithm.programmers.level1;

public class 숫자3진법뒤집기 {
    public static void main(String[] args) {

        solution(125);
    }

    public static int solution(int n) {
        int answer = 0;
        StringBuilder ternary = new StringBuilder();
        while (n > 0){
            ternary.append(n % 3);
            n /= 3;
        }

        for (int i = ternary.length() - 1; i > -1; i--) {
            int num = ternary.charAt(i) - '0';
            answer += num * Math.pow(3, ternary.length() - i - 1);
        }
        //Integer.parseInt(a,3); 대체가능

        return answer;
    }
}
