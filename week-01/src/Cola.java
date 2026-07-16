public class Cola {

    public int solution(int a, int b, int n) {
        int answer = 0; // 받을 수 있는 콜라 수
        int tmp = n; // 총 빈병
        
        while((tmp / a) >= 1){

            System.out.println(answer + " " + tmp);
            // 현재 가지고 있는 빈 병으로 받는 콜라 수 (누적시킴)
            answer += (tmp / a) * b;
            
            // 받은 콜라 다 마시고 + 나머지 빈병 = 총 빈병
            tmp = (tmp / a) * b + tmp % a;
        }
        
        
        return answer;
    }
}
