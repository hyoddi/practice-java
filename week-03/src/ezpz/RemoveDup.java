package ezpz;
// 1. 중복된 문자 제거

// 문자열 my_string이 매개변수로 주어집니다.
// my_string에서 중복된 문자를 제거하고, 
// 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

/*
    제한사항
    1 ≤ my_string ≤ 110
    my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
    대문자와 소문자를 구분합니다.
    공백(" ")도 하나의 문자로 구분합니다.
    중복된 문자 중 가장 앞에 있는 문자를 남깁니다.
*/
import java.util.*;

public class RemoveDup {
    public String solution(String my_string) {



        Set<Character> set = new HashSet<>();
        // 이렇게 구현체(HashSet) 보다 인터페이스에 의존하는게 보통 더 좋음
        // Set<String> set = new LinkedHashSet<>();
        // 과 같이 나중에 구현체 바꿀 수 있음


        String answer = "";

        for (int i = 0; i < my_string.length(); i++){

            // 아이디어 : set에 가지고있는게 아니면 추가, answer+=문자
            char tmp = my_string.charAt(i);
            if (!(set.contains(tmp))){
                set.add(tmp);
                answer+=tmp;
            }
        }
        return answer;
    }
    


}
