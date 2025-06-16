package practice.java1;

public class Java1_3 {

    /*
    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

    제한 조건
    n은 10,000,000,000이하인 자연수입니다.
     */

    public int[] solution(long n) {
        int a = 0;
        int count = 0;
        long copy = 0;
        copy = n;
        while(copy>0){
            copy/=10;
            count++;
        }
        int[] answer = new int[count];
        while(n>0){
            answer[a] = (int)(n%10);
            a++;
            n/=10;
        }
        return answer;
    }
}
