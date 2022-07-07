package org.javatutorials;
import java.util.*;
public class Problem3 {
    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> lotto = new ArrayList<>();
        for(int e: lottos) {
            lotto.add(e);
        }

        int count =0;
        for(int i=0;i<lottos.length;i++) {
            for(int j=0;j<lottos.length;j++) {
                if(lottos[j] == win_nums[i]) {
                    count++;
                    lotto.remove(Integer.valueOf(lottos[j]));
                }
            }
        }
        int min=count ,max =count;
        for(int num: lotto) {
            if(num == 0) {
                max++;
            }
        }
        int answer[] =new int[]{7-Math.max(max,1),7-Math.max(min,1)};
        return answer;
    }
}
