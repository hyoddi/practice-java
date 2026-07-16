public class Collatz {
    
        public int solution(int num) {
            int answer = 0;
            long tmp = num;
            int flag = 0;
            
            // num == 1이면 진행 X, answer = 0
            if (num != 1) {
                for(; answer < 500; answer++){
                    
                    // tmp가 짝수인 경우
                    if (tmp % 2 == 0) {tmp = tmp/2;}
                    
                    // 홀수인 경우
                    // 여기서 3을 곱할 때 int의 표현 가능 범위를 넘어갈 수 있음
                    // (입력이 8,000,000 까지 들어올 수 있음) -> 그래서 tmp를 long으로 넉넉히 선언
                    else {tmp = tmp*3 + 1;}

                    // System.out.println(answer + ", "+ tmp);
                    
                    if (tmp == 1) {
                        flag = 1;
                        break;
                    }
                        
                }
            }
            
            
            // 500번 돌렸는데 1이 안된 경우
            if (flag == 0 && answer >= 500) answer = -1;
            
            
            
            return answer + 1;
        }
}