package algorithm.programmers.level2;

public class 숫자124나라의숫자 {
    public static void main(String[] args) {

        solution(4);
    }

    public static String solution(int n) {
        String answer = "";

        String[] arr = new String[]{"4", "1", "2"};
        while (n > 0) {
            int remain = n % 3;
            n /= 3;

            if(remain == 0){
                n--;
            }
            answer = arr[remain] + answer;
        }

        System.out.println(answer);
        return answer;
    }
}
