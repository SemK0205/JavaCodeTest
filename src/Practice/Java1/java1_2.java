package practice.java1;

public class Java1_2 {

    /*
    자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
    예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

    제한사항
    N의 범위 : 100,000,000 이하의 자연수
     */

    public int solution(int n) {
        int answer = 0;

        for( ; n > 0 ;n /= 10){
            answer += (n%10);

        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.


        return answer;
    }
}
