import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int N = Integer.parseInt(st.nextToken());
        // int M = Integer.parseInt(st.nextToken());

        // StringBuilder sb = new StringBuilder();

        System.out.println("\n-----나머지 1 문제----\n");
        Last1 l = new Last1();
        int answer = l.solution(10);
        System.out.println(answer);



        System.out.println("\n-----콜라츠 문제----\n");
        Collatz c = new Collatz();
        int answer1 = c.solution(1);
        System.out.println(answer1);

        System.out.println("\n-----콜라 빈병 문제----\n");

        Cola cola = new Cola();
        int answer2 = cola.solution(2, 1, 20);
        System.out.println(answer2);
        
        System.out.println("\n-----하샤드 수 문제----\n");
        HarshardNumber h = new HarshardNumber();
        boolean answer3 = h.solution(10);
        System.out.println(answer3);


    }
}
