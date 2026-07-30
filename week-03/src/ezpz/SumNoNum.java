package ezpz;
/*
문제 설명
0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return
하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ numbers의 길이 ≤ 9
0 ≤ numbers의 모든 원소 ≤ 9
numbers의 모든 원소는 서로 다릅니다.

*/

import java.util.*;

public class SumNoNum {
    public int solution(int[] numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= 9; i++){
            set.add(i);
        }

        // idea: Set에 0~9를 넣고, numbers에 있는 수면 Set에서 제거
        for (int i : numbers){
            if (set.contains(i)){
                set.remove(i);
            }
        }

        // 이후 남아있는거 sum
        for (int i : set){
            answer+=i;
        }

        return answer;
    }
}

/*

그냥 합을 정해두고 빼기만 하는 간단한 풀이도 있더라..

class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}

*/