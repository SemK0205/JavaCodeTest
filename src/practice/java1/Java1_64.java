package practice.java1;

public class Java1_64 {

    /*
    문자열 s가 입력되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해하려고 합니다.

    먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
    이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서,
    x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다.
    처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
    s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다.
    남은 부분이 없다면 종료합니다.
    만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.
    문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고,
    분해한 문자열의 개수를 return 하는 함수 solution을 완성하세요.

    제한사항
    1 ≤ s의 길이 ≤ 10,000
    s는 영어 소문자로만 이루어져 있습니다.
     */

    public int solution(String s) {
        int answer = 0;
        int index = 0;

        while (index < s.length()) {
            answer++;
            char firstChar = s.charAt(index);
            int firstCharCount = 0;
            int otherCharCount = 0;
            int i = index;
            for (; i < s.length(); i++) {
                if (s.charAt(i) == firstChar) {
                    firstCharCount++;
                } else {
                    otherCharCount++;
                }

                if (firstCharCount == otherCharCount) {
                    index = i + 1;
                    break;
                }
            }
            if (i == s.length()) {
                break;
            }
        }

        return answer;
    }
}
