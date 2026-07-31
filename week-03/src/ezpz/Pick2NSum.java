package ezpz;
/*
문제 설명
정수 배열 numbers가 주어집니다.
numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아,
더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록
solution 함수를 완성해주세요.

제한사항
numbers의 길이는 2 이상 100 이하입니다.
numbers의 모든 수는 0 이상 100 이하입니다.
*/
import java.util.*;

public class Pick2NSum {
    public int[] solution(int[] numbers) {
        
        // idea: 합이 중복이 없어야함 -> HashSet 사용
        Set<Integer> set = new HashSet<>();

        // 모든 인덱스 접근(모든 조합 만들어봐야)하니까 이중 for문.. 말고 다른게 있나
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        // 오름차순으로 정렬해야 출력 형식이 맞음
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}