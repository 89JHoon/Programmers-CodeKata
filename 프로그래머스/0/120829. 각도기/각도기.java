class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if(angle == 90){
            answer = 2;
            
        }else if(angle == 180){
            answer = 4;
            
        }else if(0 <= angle && angle <= 89){
            answer = 1;
            
        }else{
            answer = 3;
        }
        return answer;
    }
}