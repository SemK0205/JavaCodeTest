package practice.java1;

import java.util.ArrayList;
import java.util.List;

public class Java1_53 {

    /*
    수포자는 수학을 포기한 사람의 준말입니다.
    수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
    수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

    1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
    2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
    3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

    1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
    가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

    제한 조건
    시험은 최대 10,000 문제로 구성되어있습니다.
    문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
    가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
     */

    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int n = 0;
        while(n < answers.length) {
            int t1 = n % 5;
            int t2 = n % 8;
            int t3 = n % 10;

            if(arr1[t1] == answers[n]){
                count1++;
            }

            if(arr2[t2] == answers[n]){
                count2++;
            }

            if(arr3[t3] == answers[n]){
                count3++;
            }
            n++;
        }

        int max = Math.max(count1, Math.max(count2, count3));

        if(max == count1){
            answer.add(1);
        }
        if(max == count2){
            answer.add(2);
        }
        if(max == count3){
            answer.add(3);
        }

        return answer;
    }
}
