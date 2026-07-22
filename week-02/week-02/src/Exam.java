/*
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
*/
import java.util.*;

public class Exam {
    public int[] solution(int[] answers) {
        int[] cnt = new int[3];
        ArrayList<Integer> result = new ArrayList<>();

        // 1번 수포자
        // 12345 가 계속 반복됨
        int[] man1 = {1,2,3,4,5};

        // 2번 수포자
        int[] man2 = {2,1,2,3,2,4,2,5};

        // 3번 수포자
        int[] man3 = {3,3,1,1,2,2,4,4,5,5};


        for (int i = 0; i < answers.length; i++){

            // 각 수포자의 반복되는 부분은 모듈러 연산 이용, answer 원소와 하나씩 비교
            if (answers[i] == man1[i % man1.length]) {cnt[0]++;}
            if (answers[i] == man2[i % man2.length]) {cnt[1]++;}
            if (answers[i] == man3[i % man3.length]) {cnt[2]++;}

        }

        // 최댓값 찾기
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));

        // 최댓값과 일치하는 cnt라면, answer 리스트에 추가
        // 이러면 무조건 오름차순
        for (int i = 0; i < cnt.length; i++){
            if (max == cnt[i]){
                result.add(i+1);
            }
        }

        // 리스트에서 배열로 어거지로 바꿔주기
        // 공배열에서 push가 안되서...
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}
