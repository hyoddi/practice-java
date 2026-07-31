package ezpz;
/*
문제 :
정수를 저장하는 덱(Deque)를 구현한 다음, 입력을 주어지는 명령을 처리하는 pg를 만들어라

명령은 총 8가지
- push_front X: 정수 X를 덱의 앞에 넣는다.
- push_back X: 정수 X를 덱의 뒤에 넣는다.
- pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
- pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
- size: 덱에 들어있는 정수의 개수를 출력한다.
- empty: 덱이 비어있으면 1, 아니면 0을 출력한다.
- front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
- back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.

입력:
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
문제에 나와있지 않은 명령이 주어지는 경우는 없다.

출력:
출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Deck {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 별거 없고, 자바는 Deque 컬렉션을 이용하면 되서 메서드 사용법을 잘 알고 있냐는 문제가 되겠다
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            String op = command[0];

            switch (op) {
                case "push_front":
                    // 앞쪽에 추가
                    deque.offerFirst(Integer.parseInt(command[1]));
                    break;
                case "push_back":
                    // 뒤쪽에 추가
                    deque.offerLast(Integer.parseInt(command[1]));
                    break;
                case "pop_front":
                    // 앞에서 꺼내고, 비었으면 -1 출력
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    // 뒤에서 꺼내고, 비었으면 -1 출력
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;
                case "size":
                    // 현재 덱 크기 출력
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    // 비어 있으면 1, 아니면 0 출력
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    // 앞쪽 원소 확인, 비었으면 -1 출력
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                    break;
                case "back":
                    // 뒤쪽 원소 확인, 비었으면 -1 출력
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }

        System.out.print(sb.toString());
    }
}
