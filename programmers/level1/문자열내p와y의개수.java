package algorithm.programmers.level1;

import java.util.stream.IntStream;

public class 문자열내p와y의개수 {
    public static void main(String[] args) {

        solution("Pyy");
    }

    public static boolean solution(String s) {
        String str = s.toLowerCase();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'p'){
                result++;
            }
            if(str.charAt(i) == 'y'){
                result--;
            }
        }
        System.out.println(result);

        return result == 0;
    }
}
