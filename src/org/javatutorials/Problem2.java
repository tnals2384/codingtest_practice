package org.javatutorials;
import java.util.*;
public class Problem2 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String,HashSet<String>> map = new HashMap<>();
        Map<String,Integer> count = new HashMap<>();

        for(int i=0;i<id_list.length;i++) {
            map.put(id_list[i],new HashSet<>());
            count.put(id_list[i],i);
        }
        for (String e: report) {
            String[] id = e.split(" ");
            map.get(id[1]).add(id[0]);
        }

        for (int i=0;i<id_list.length;i++) {
            HashSet<String> rep = map.get(id_list[i]);
            if (rep.size() >= k) {
                for(String name: rep) {
                    answer[count.get(name)]++;
                }
            }
        }
        return answer;

    }
}
