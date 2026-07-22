import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("==== 과제 1번 : k번째 ====");
        Knum answer1 = new Knum();
        int[] arr1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
            {2, 5, 3},
            {4, 4, 1},
            {1, 7, 3}
        };
        System.out.println(
            Arrays.toString(answer1.solution(arr1, commands))
        );


        System.out.println("\n=== 과제 2번 : 내맘대로문자열 ===");
        StringSort answer2 = new StringSort();
        String[] arr2 = {"sun", "bed", "car"};
        System.out.println(
            Arrays.toString(answer2.solution(arr2, 1))
        );


        System.out.println("\n=== 과제 3번 : 모의고사 ");
        Exam answer3 = new Exam();
        int[] arr3 = {1,3,2,4,2};
        System.out.println(
            Arrays.toString(answer3.solution(arr3))
        );


        System.out.println("\n=== 과제 4번 : 카펫 ");
        Carpet answer4 = new Carpet();
        System.out.println(
            Arrays.toString(answer4.solution(10, 2))
        );

        System.out.println("\n=== 과제 5번 : 컴팩트한 명함카드 ");
        BusinessCard answer5 = new BusinessCard();
        int[][] arr5 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(answer5.solution(arr5));
    }
}