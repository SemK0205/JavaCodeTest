package practice.java1;

public class Java1_34 {

    /*
    자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
    이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

    제한사항
    n은 1 이상 100,000,000 이하인 자연수입니다.
     */

    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        int copy = n;
        int count = 0;
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
            count++;
        }

        int count1 = 0;
        for(int i = count; i > 0; i--){
            answer += (sb.toString().charAt(i-1)-'0') * Math.pow(3, count1);
            count1++;
        }
        return answer;
    }
}
