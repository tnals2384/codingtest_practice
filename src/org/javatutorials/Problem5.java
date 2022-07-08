package org.javatutorials;

import java.util.HashMap;

import static java.lang.Math.abs;

public class Problem5 {
    public static String solution(int[] numbers, String hand) {
        String answer = "";

        int lr = 3; //left row
        int lc= 0; //left col
        int rr = 3; //right row
        int rc = 2; //right col
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]==0) numbers[i]=11;
            if(numbers[i]%3 ==2) {
                    int L =abs(lr -numbers[i]/3)+abs(lc-1); //왼손 거리
                    int R = abs(rr -numbers[i]/3)+abs(rc-1); // 오른손거리
                    if(L>R) {
                        answer+= "R";
                        rr=numbers[i]/3;
                        rc=1;
                    }
                    else if(L < R) {
                        answer+= "L";
                        lr =numbers[i]/3;
                        lc =1;
                    }
                    else {
                        if (hand == "left") {
                            answer += "L";
                            lr = numbers[i] / 3;
                            lc = 1;
                        }
                        else {
                            answer+= "R";
                            rr=numbers[i]/3;
                            rc=1;
                        }
                    }
                System.out.println(L);
                System.out.println(R+"\n");
                System.out.println(i+"\n");

            }
            else if(numbers[i]%3 == 1) {
                answer+= "L";
                lr =numbers[i]/3;
                lc =0;
            }
            else if(numbers[i]%3==0) {
                answer+= "R";
                rr=numbers[i]/3-1;
                rc=2;
            }


        }

        return answer;
    }

    public static void main(String[] args) {
        int[] ss = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        System.out.println(solution(ss,"left"));
    }
}
