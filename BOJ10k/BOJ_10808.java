package algorithm.BOJ10k;

import java.util.Scanner;

public class BOJ_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] alphabet = new int[26];

        String temp = sc.next();

        for (int i = 0; i < temp.length(); i++) {
            alphabet[temp.charAt(i)-'a']++;
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i]+" ");
        }

    }
}
