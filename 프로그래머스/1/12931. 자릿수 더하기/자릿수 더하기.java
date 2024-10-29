import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;

        while(n!=0){
                a = n%10;
                n = n/10;
            answer = answer + a; 
            }
        return answer;
    }
}