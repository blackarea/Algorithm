package algorithm.BOJ10k;

import java.util.Scanner;

public class BOJ_10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String lazer = sc.nextLine();

        int stick = 0;
        int sum = 0;

        for (int i = 0; i < lazer.length(); i++) {
            if (lazer.charAt(i) == '(') {
                if (lazer.charAt(i + 1) == ')') {
                    sum += stick;
                    i++;
                    continue;
                }
                stick++;
            }
            else{
                sum++;
                stick--;
            }
        }

        System.out.println(sum);
    }
}
