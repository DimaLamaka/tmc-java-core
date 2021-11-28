package by.lamaka.lesson8.task2.service;

import java.util.*;


public class NumberServiceImpl implements NumberService {
    @Override
    public Map<Integer, Integer> createMapCountOfOccurNumbs(int[] array) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int key : array) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }else{
                map.put(key, 1);
            }
        }
        return map;
    }
}
