package ezpz;
/*
문제 설명
문자열 배열 strArr이 주어집니다.
strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때, 
가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ strArr의 길이 ≤ 100,000
1 ≤ strArr의 원소의 길이 ≤ 30
strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.
*/
import java.util.*;

public class StringJoin {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // idea: 문자열 길이가 key, val은 수
        // -> getOrDefault를 사용해서 없으면 0, 아니면 +1
        for (String i : strArr){
            map.put(i.length(), map.getOrDefault(i.length(), 0) + 1);
        }

        answer = Collections.max(map.values());
        // map.values는 Collection<Integer> 를 반환한다!

        return answer;
    }
}

/*

배운걸 써먹고 싶어서 해시맵을 썼는데, 해시를 계산하는 비용을 고려하면
아래 풀이가 낫다

public int solution(String[] strArr) {
    int[] cnt = new int[31];
    // 문자열 길이 범위가 1~30으로 고정되어 있어서 HashMap보다 배열로 카운트하는 게 더 단순하다.
    // 배열은 인덱스로 바로 접근하므로 해시맵보다 오버헤드가 적다.
    int answer = 0;

    for (String s : strArr) {
        cnt[s.length()]++;
        answer = Math.max(answer, cnt[s.length()]);
    }

    return answer;
}

*/