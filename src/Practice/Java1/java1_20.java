package practice.java1;

public class Java1_20 {

    /*
    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

    재한사항
    s는 길이가 1 이상, 100이하인 스트링입니다.
     */

    public String solution(String s) {
        String answer = "";
        int count = s.length();
        if(s.length() % 2 == 1){
            answer += s.charAt(count/2);
        } else{
            answer = answer +  s.charAt(count/2 - 1) +  s.charAt(count/2);
        }
        return answer;
    }
}
