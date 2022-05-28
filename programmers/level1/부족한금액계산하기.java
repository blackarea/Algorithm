package algorithm.programmers.level1;

public class 부족한금액계산하기 {

    public static void main(String[] args) {
        System.out.println(solution(1, 6, 4));
    }

    public static long solution(int price, int money, int count) {
        for (int i = 0; i < count; i++) {
            money -= price * (i + 1);
        }

        return money < 0 ? -money : 0;
        //다른 풀이
        //return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
