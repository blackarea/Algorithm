package algorithm.programmers.level1;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12919
public class 서울에서김서방찾기 {
    public static void main(String[] args) {

    }

    public String solution(String[] seoul) {
        String answer = "";

        answer = String.valueOf(Arrays.asList(seoul).indexOf("Kim"));

        return "김서방은 " + answer + "에 있다";
    }
}
