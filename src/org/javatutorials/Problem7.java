package org.javatutorials;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem7 {
    public int solution(int[] numbers) {
        int sum = 0;
        for(int i =0;i < numbers.length;i++) {
            sum+=numbers[i];
        }

        return 45-sum;
    }
}
