package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int min = 1000;
        if(min > w-x)
            min = w-x;
        if(min > x)
            min = x;
        if(min > h-y)
            min = h-y;
        if(min > y)
            min = y;

        System.out.println(min);
    }
}
