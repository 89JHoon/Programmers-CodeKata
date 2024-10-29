class Solution {
    public String solution(int num) {
        int a = num%2;
        String answer = "even";
        if(a==0){
            answer ="Even";
        }else{
            answer ="Odd";
        }
        
        
        return answer;
    }
}