package practice.java1;

public class Java1_36 {

    /*
    문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
    각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
    각 단어의 짝수번째 알파벳은 대문자로,
    홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

    제한 사항
    문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
    첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
     */

    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ", -1); 
        // limit < 0 => 연속된 공백도 무시하지않고 그대로 반환
        // limit = 0 => 연속된 공백은 무시하고 하나로 처리

        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < arr[i].length(); j++){
                if(j % 2 == 0){
                    sb.append(arr[i].toUpperCase().charAt(j));
                } else {
                    sb.append(arr[i].toLowerCase().charAt(j));
                }
            }
            arr[i]  = sb.toString();
        }
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1){
                answer += arr[i] + " ";
            } else {
                answer += arr[i];
            }

        }
        return answer;
    }
}
