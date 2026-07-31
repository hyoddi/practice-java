package ezpz;
/*
문제 설명
배열 arr가 주어집니다.
배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.

예를 들면,

arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.

배열 arr에서 연속적으로 나타나는 숫자는 제거하고, 
남은 수들을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

*/
import java.util.*;

public class HateSameNum {
    public int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();

        // idea:
        // 지금 숫자 num이 바로 직전 값과 같으면 연속된 중복이므로 건너뜀
        // 다르면 스택에 추가해서 순서를 유지한 채 결과를 만들기
        // hashSet 쓰면 중복 잡는거 쉬운거 아니냐?
        // -> "연속적인" 거만 잡아야함. 전체에선 중복 가능
        for (int num : arr) {
            if (stk.isEmpty() || stk.peekLast() != num) {
                stk.offerLast(num);
            }
        }

        // 반환값이 배열이라 deque의 내용을 배열로 복사해서 반환
        int[] answer = new int[stk.size()];
        int idx = 0;

        for (int num : stk) {
            answer[idx++] = num;
        }

        return answer;
    }
}
