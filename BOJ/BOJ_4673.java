package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_4673 {
    public static void main(String[] args) {

        boolean[] arr = new boolean[10001];

        int num;
        for (int i = 1; i < 10001; i++) {
            num=d(i);
            if(num<=10000){
                arr[num] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if(!arr[i])
                System.out.println(i);
        }


    }

    public static int d(int number){
        int sum = number;
        while(number > 0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
