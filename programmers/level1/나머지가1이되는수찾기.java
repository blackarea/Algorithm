package algorithm.programmers.level1;

public class 나머지가1이되는수찾기 {
    public static void main(String[] args) {

        solution(17);
    }

    public static int solution(int n) {
        for (int i = 1; i < n; i++) {
            if(n % i == 1){
                return i;
            }
        }
        return 0;
    }
}
