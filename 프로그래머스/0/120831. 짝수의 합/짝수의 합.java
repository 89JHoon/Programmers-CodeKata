class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        
        
        for(int i=0; i<n+1;  i++){
            if(i%2 == 0){
                answer = i + answer;
            }else{  
            }         
        }
        
        return answer;
    }
}