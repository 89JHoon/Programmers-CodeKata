class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n ; i++){
            int a = n % i;
            if( a!= 0){
                answer  = answer + 0;
            }else{
            answer = answer + i;    
            }
            
        }
        return answer;
    }
}