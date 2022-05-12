package algorithm.programmers.level1;

public class 하샤드수 {
    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    public static boolean solution(int x) {
        int sum = 0;
        int temp = x;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if(x % sum == 0){
            return true;
        }
        return false;
    }
}
