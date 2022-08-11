package org.javatutorials;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DequeSW {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken());
        int L= Integer.parseInt(st.nextToken());

        Deque<Node> mydeq = new LinkedList<>();
        st= new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++) {
            int now = Integer.parseInt(st.nextToken());

            //now값보다 값이 크면 삭제해버림
            while(!mydeq.isEmpty() && mydeq.getLast().value> now) {
                mydeq.removeLast();
            }
            //now node 추가
            mydeq.addLast(new Node(now,i));
            //i-L범위를 벗어나면 삭제
            if(mydeq.getFirst().index<=i-L)
                mydeq.removeFirst();
            bw.write(mydeq.getFirst().value+" ");
        }
        bw.flush();
        bw.close();
    }


    //노드 클래스. 자신의 index와 value를 저장.
    static class Node {
        public int index;
        public int value;

        Node(int value, int index) {
            this.index= index;
            this.value=value;
        }
    }
}
