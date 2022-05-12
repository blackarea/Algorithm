package algorithm.BOJ10k;

import java.util.Scanner;

public class BOJ_10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - (i + 1); j++)
                System.out.print(" ");

            System.out.print("*");
            if (i != 0) {
                for (int j = 0; j < (i * 2) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        for (int j = 0; j < (n * 2) - 1; j++)
            System.out.print("*");
    }
}
