package practice.java1;

import java.util.Arrays;

public class Java1_11 {

    /*
    함수 solution은 정수 n을 매개변수로 입력받습니다.
    n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    예를들어 n이 118372면 873211을 리턴하면 됩니다.

    제한 조건
    n은 1이상 8000000000 이하인 자연수입니다.
     */

    public long solution(long n) {
        long answer = 0;
        String str = ""+n;
        Character[] arr = new Character[str.length()];
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr,(a, b)->b-a);
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }

        answer = Long.parseLong(sb.toString());


        return answer;
    }
}
