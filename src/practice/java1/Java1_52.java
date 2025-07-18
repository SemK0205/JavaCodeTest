package practice.java1;

import java.util.HashMap;
import java.util.Map;

public class Java1_52 {

    /*
    2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
    두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
    요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

    입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

    제한 조건
    2016년은 윤년입니다.
    2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
     */

    public String solution(int a, int b) {
        String answer = "";
        int sum = 0;
        Map<Integer, String> day = new HashMap<>();
        day.put(0, "THU");
        day.put(1, "FRI");
        day.put(2, "SAT");
        day.put(3, "SUN");
        day.put(4, "MON");
        day.put(5, "TUE");
        day.put(6, "WED");

        Map<Integer, Integer> count = new HashMap<>();
        count.put(1,31);
        count.put(2,29);
        count.put(3,31);
        count.put(4,30);
        count.put(5,31);
        count.put(6,30);
        count.put(7,31);
        count.put(8,31);
        count.put(9,30);
        count.put(10,31);
        count.put(11,30);
        count.put(12,31);

        for(int i = 1; i < a; i++) {
            sum += count.get(i);
        }

        answer = day.get((sum+b)%7);

        return answer;
    }
}
