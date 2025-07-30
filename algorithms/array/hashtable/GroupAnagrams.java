package algorithms.array.hashtable;

//https://leetcode.com/problems/group-anagrams/description/


import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupMap = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            groupMap.putIfAbsent(sortedWord, new ArrayList<>());
            groupMap.get(sortedWord).add(s);
        }
        return new ArrayList<>(groupMap.values());
    }
}
