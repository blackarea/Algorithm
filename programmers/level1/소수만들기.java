package algorithm.programmers.level1;

public class 소수만들기 {
    public static void main(String[] args) {

        solution(new int[]{1, 2, 7, 6, 4});
    }

    public static int solution(int[] nums) {
        int answer = 0;

        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    answer += isPrime(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        System.out.println(answer);

        return answer;
    }

    private static int isPrime(int sum) {
        for (int l = 2; l <= (int) Math.sqrt(sum); l++) {
            if (sum % l == 0) {
                return 0;
            }
        }
        return 1;
    }
}
