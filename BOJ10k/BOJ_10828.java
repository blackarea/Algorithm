package algorithm.BOJ10k;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = sc.nextInt();
        String str;

        for (int i = 0; i < N; i++) {
            str = sc.next();

            if (str.equals("push")) {
                stack.push(sc.nextInt());
            } else if (str.equals("pop")) {
                if(!stack.empty()){
                    sb.append(stack.pop()).append('\n');
                }else{
                    sb.append("-1").append('\n');
                }
            }else if (str.equals("size")) {
                sb.append(stack.size()).append('\n');
            }else if (str.equals("empty")) {
                if(stack.empty()){
                    sb.append("1").append('\n');
                }else{
                    sb.append("0").append('\n');
                }
            }else if (str.equals("top")) {
                if(!stack.empty()){
                    sb.append(stack.peek()).append('\n');
                }else{
                    sb.append("-1").append('\n');
                }
            }


        }
        System.out.println(sb);


    }
}
