import ezpz.Deck;
import ezpz.HateSameNum;
import ezpz.HowSimilarArr;
import ezpz.Pick2NSum;
import ezpz.Ponkemon;
import ezpz.RemoveDup;
import ezpz.StringJoin;
import ezpz.SumNoNum;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

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


        System.out.println("\n=== 5번: 폰켓몬 ===");
        Ponkemon p5 = new Ponkemon();
        int[] nums = {3, 1, 2, 3};
        System.out.println(p5.solution(nums));


        System.out.println("\n=== 6번: 같은 숫자는 싫어 ===");
        HateSameNum p6 = new HateSameNum();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] result = p6.solution(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();


        System.out.println("\n=== 7번: 두 개 뽑아서 더하기 ===");
        Pick2NSum p7 = new Pick2NSum();
        int[] nums2 = {2, 1, 3, 4, 1};
        int[] result2 = p7.solution(nums2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();


        System.out.println("\n=== 8번: 덱 명령 처리 ===");
        String deckInput = "15\n"
                + "push_back 1\n"
                + "push_front 2\n"
                + "front\n"
                + "back\n"
                + "size\n"
                + "empty\n"
                + "pop_front\n"
                + "pop_back\n"
                + "pop_front\n"
                + "size\n"
                + "empty\n"
                + "pop_back\n"
                + "push_front 3\n"
                + "empty\n"
                + "front\n";

        System.setIn(new ByteArrayInputStream(deckInput.getBytes(StandardCharsets.UTF_8)));

        Deck deck = new Deck();
        deck.solution();
    }
}
