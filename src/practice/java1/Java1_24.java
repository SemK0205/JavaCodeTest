package practice.java1;

public class Java1_24 {

    /*
    두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
    약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

    제한사항
    1 ≤ left ≤ right ≤ 1,000
     */

    public int solution(int left, int right) {
        int count = 0;
        int answer = 0;
        for(int i = left; i <= right; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count % 2 == 0){
                answer += i;
            } else {
                answer -= i;
            }
            count = 0;
        }
        return answer;
    }
}
