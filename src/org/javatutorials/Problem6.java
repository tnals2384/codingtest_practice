package org.javatutorials;

import java.util.*;

public class Problem6 {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer> basket = new Stack<>();
            for(int i =0;i<moves.length;i++) {
                for(int j=0;j<board.length;j++) {
                    int item = board[j][moves[i]-1];
                    if(item!=0) {
                        if (!basket.empty()&&basket.peek() == item) {
                            basket.pop();
                            answer+= 2;
                        } else {
                            basket.push(item);
                        }
                    }
                    break;
                }
            }
            return answer;
        }
}
