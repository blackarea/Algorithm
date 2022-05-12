package algorithm.BOJ;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();

        int n = sc.nextInt();
        String temp;

        boolean vps;

        for (int i = 0; i < n; i++) {
            vps = true;
            temp = sc.next();

            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '(') {
                    stack.push('(');
                } else {
                    if (!stack.empty()) {
                        stack.pop();
                    } else {
                        vps = false;
                        break;
                    }
                }

            }

            if (!stack.empty()) {
                vps = false;
            }
            stack.clear();
            if (vps) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


    }
}
