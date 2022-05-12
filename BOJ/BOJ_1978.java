package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            boolean a = true;
            if(num==1){
                continue;
            }
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if(num%j==0){
                    a=false;
                    break;
                }
            }
            if (a)
                sum++;
        }
        System.out.println(sum);
    }
}
