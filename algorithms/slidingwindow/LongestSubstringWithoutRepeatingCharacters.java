package algorithms.slidingwindow;

import java.util.HashSet;
import java.util.Set;
//Time complexity: O(n)
//Space complexity: O(1)
//https://leetcode.com/problems/longest-substring-without-repeating-characters

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkewe"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            while (charSet.contains(s.charAt(end))) {
                charSet.remove(s.charAt(start));
                start++;
            }
            charSet.add(s.charAt(end));
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public int lengthOfLongestSubstring1(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            if (!window.contains(s.charAt(right))) {
                window.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                window.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}
