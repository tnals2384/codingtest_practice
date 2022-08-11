package org.javatutorials;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min =sc.nextInt();
        int max =sc.nextInt();
        int count=0;
        for(int i=min;i<=max;i++) {
            String num = Integer.toString(i);
            int len = num.length();
            if(len==1) {;
                count++;
                continue;
            }
            for(int j=0; j<len/2;j++) {
                if(num.charAt(j)!=num.charAt(len-1-j))
                    continue;
                count++;
            }
        }
        System.out.println(count);
    }
}

