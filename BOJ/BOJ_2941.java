package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String s = sc.nextLine();

        for (int i = 0; i < arr.length; i++) {
            s = s.replace(arr[i], "!");
        }
        System.out.println(s.length());

    }
}
