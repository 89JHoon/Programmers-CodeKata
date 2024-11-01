class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        int a = n-1;
        
        do{
            
            i = i+ 1;
            
        }while(a%i != 0);
        
            
        return i;
    }
}