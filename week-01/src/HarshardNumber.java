/*
문제 설명
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

제한 조건
x는 1 이상, 10000 이하인 정수입니다.
*/

class Hashad {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        int max = 1;
        int tmp = x;
        // 몇 자리 수인지 찾기 (10으로 계속 나눠서 몫이 0일 때까지 찾기)
        for (int i = 1; i < 6; i++){
            tmp /= 10;
            if (tmp == 0){ max = i; break;}
        }

        
        for (int i = 0; i < max; i++){

            sum += (x % Math.pow(10, i + 1)) /  Math.pow(10,i);

            /*
            첫 째 자리 수
            % 10

            둘째 자리 수
            % 100
            / 10
            
            ...
            
            */
            
        }

        if (x % sum != 0) {answer = false;}
        
        return answer;
    }
}