package algorithm.programmers.level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class KAKAO_2018_캐시 {
    public static void main(String[] args) {

        solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"});
    }

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int cacheHit = 1;
        int cacheMiss = 5;

        String[] lowerCaseCities = cities;
        for (int i = 0; i < cities.length; i++) {
            lowerCaseCities[i] = lowerCaseCities[i].toLowerCase();
        }

        Queue<String> cityCache = new LinkedList<>();
        for (String city : lowerCaseCities) {
            if (cityCache.contains(city)) {
                answer += cacheHit;
                cityCache.remove(city);
            } else {
                answer += cacheMiss;
            }
            cityCache.add(city);
            if (cityCache.size() > cacheSize) {
                cityCache.remove();
            }
        }
        System.out.println(answer);
        return answer;
    }
}
