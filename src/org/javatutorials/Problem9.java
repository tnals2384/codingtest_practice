package org.javatutorials;

import java.util.ArrayList;
import java.util.List;

public class Problem9 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i< signs.length;i++) {
            if(signs[i]) {
                answer += absolutes[i];
            }
            else {
                answer -= absolutes[i];
            }
        }


        return answer;
    }
}
