package org.javatutorials;


import java.util.Arrays;

public class Problem8 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer= n-lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);
        //여분이 있는 사람이 도둑맞을 경우
        for(int i=0;i<lost.length;i++) {
            for(int j=0; j<reserve.length;j++) {
                if(lost[i] == reserve[j]) {
                    lost[i]=-1;
                    reserve[j]=-1;
                    answer++;
                }
            }
        }

        for(int i=0;i<lost.length;i++)
        {
            for(int j=0; j<reserve.length;j++) {
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]) {
                    reserve[j]= -1;
                    answer++;
                }
            }
        }

        return answer;
    }
}
