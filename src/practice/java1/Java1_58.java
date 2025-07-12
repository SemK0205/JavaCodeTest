package practice.java1;

public class Java1_58 {

    /*
    머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다.
    조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고
    연속해서 같은 발음을 하는 것을 어려워합니다. 문자열 배열 babbling이 매개변수로 주어질 때,
    머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.

    제한사항
    1 ≤ babbling의 길이 ≤ 100
    1 ≤ babbling[i]의 길이 ≤ 30
    문자열은 알파벳 소문자로만 이루어져 있습니다.
     */

    public int solution(String[] babbling) {
        int answer = 0;
        String[] possibleWords = {"aya", "ye", "woo", "ma"}; // 가능한 발음들

        for (String word : babbling) {
            String tempWord = word; // 원본 단어를 변경하지 않기 위해 임시 변수 사용

            boolean consecutiveFound = false;
            // 1. 같은 발음이 연속해서 오는 경우를 먼저 검사
            for (String pWord : possibleWords) {
                if (tempWord.contains(pWord + pWord)) { // "ayaaya", "yeye" 등 연속 발음 확인
                    consecutiveFound = true;
                    break;
                }
            }

            if (consecutiveFound) {
                continue; // 연속 발음이 있으면 다음 단어로 넘어감
            }

            // 2. 가능한 발음들을 공백으로 치환 (또는 다른 유니크한 문자로 치환 후, 남은 문자 확인)
            for (String pWord : possibleWords) {
                tempWord = tempWord.replace(pWord, " "); // 가능한 발음을 공백으로 치환
            }

            // 3. 치환 후 남은 공백을 제거
            tempWord = tempWord.replace(" ", ""); // 모든 공백 제거

            // 4. 모든 발음이 유효하게 사용되었는지 확인
            if (tempWord.isEmpty()) { // 공백 제거 후 문자열이 비어있다면 유효한 단어임
                answer++;
            }
        }

        return answer;
    }
}
