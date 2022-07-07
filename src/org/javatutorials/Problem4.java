package org.javatutorials;

import java.util.HashMap;

public class Problem4 {
    public int solution(String s) {
        int answer = 0;
        HashMap<Integer,String> number = new HashMap<>();
        String[] num = {"zero", "one", "two", "three","four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<10;i++) {
            number.put(i,num[i]);
        }
        for(int i=0;i<10;i++) {
            s = s.replaceAll(number.get(i),""+i);
        }
        answer = Integer.parseInt(s);

        return answer;
    }
}
