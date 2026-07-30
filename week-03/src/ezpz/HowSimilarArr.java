package ezpz;
/*
문제 설명
두 배열이 얼마나 유사한지 확인해보려고 합니다.
문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록, 
solution 함수를 완성해주세요.

제한사항
1 ≤ s1, s2의 길이 ≤ 100
1 ≤ s1, s2의 원소의 길이 ≤ 10
s1과 s2의 원소는 알파벳 소문자로만 이루어져 있습니다
s1과 s2는 각각 중복된 원소를 갖지 않습니다.
*/

import java.util.*;

public class HowSimilarArr {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> comp = new HashSet<>();
        
        for (String i : s2){
            comp.add(i);
        }
        // HashSet<String> set = new HashSet<>(List.of(s1));
        // 이렇게 해도 된다네용.


        // idea: 문자 배열 하나를 set으로 옮기고, 거기 있음 answer++
        for (int i = 0; i < s1.length; i++){
            if (comp.contains(s1[i])){
                answer+=1;
            }
        }

        return answer;
    }
}
