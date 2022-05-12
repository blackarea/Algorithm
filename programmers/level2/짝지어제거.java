package algorithm.programmers.level2;

import java.util.Stack;

public class 짝지어제거 {
    public static void main(String[] args) {

        System.out.println(solution("baabaa"));
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if(stack.isEmpty() || stack.peek() != c){
                stack.push(c);
            }else {
                stack.pop();
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
