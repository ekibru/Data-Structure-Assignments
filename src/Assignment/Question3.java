package Assignment;

import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class Question3 {
    public static Map<String, Integer> mergeLists(List<String> list1, List<Integer>
            list2){
        Map<String, Integer> map = new TreeMap<>();
        int size = (list1.size() < list2.size()) ? list1.size(): list2.size();
        for (int i = 0; i < size; i++){
            map.put(list1.get(i), list2.get(i));
        }
        return map;
    }
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add("Kidane");
        list1.add("Bmw");
        list1.add("Tesla");
        list2.add(20);
        list2.add(30);
        list2.add(32);
        System.out.println(mergeLists(list1,list2));
    }
}
