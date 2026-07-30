import ezpz.HowSimilarArr;
import ezpz.RemoveDup;
import ezpz.StringJoin;
import ezpz.SumNoNum;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== 1번: 중복 문자 제거 ===");
        RemoveDup p1 = new RemoveDup();

        String answer1 = p1.solution("people");
        System.out.println(answer1);


        System.out.println("\n=== 2번: 두 배열 유사도 확인 ===");
        HowSimilarArr p2 = new HowSimilarArr();
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(p2.solution(s1, s2));


        System.out.println("\n=== 3번: 문자열 묶기 ===");
        StringJoin p3 = new StringJoin();
        String[] strArr = {"a","bc","d","efg","hi"};
        System.out.println(p3.solution(strArr));


        System.out.println("\n=== 4번: 없는 숫자 더하기 ===");
        SumNoNum p4 = new SumNoNum();
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(p4.solution(numbers));

    }
}
