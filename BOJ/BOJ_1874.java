package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        int temp = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            sb.append("+\n");
            while (!stack.isEmpty() && stack.peek() == arr[temp]){
                temp++;
                stack.pop();
                sb.append("-\n");
            }

        }
        if(temp == n){
            System.out.println(sb);
        }else {
            System.out.println("NO");
        }
        
    }
}
