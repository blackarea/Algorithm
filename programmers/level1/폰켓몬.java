package algorithm.programmers.level1;

import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 2}));
    }

    public static int solution(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }

        if (hashSet.size() > nums.length / 2)
            return nums.length / 2;

        return hashSet.size();
    }
}
