You can add the following formatted section to your README.md, ensuring it fits markdown conventions and is easy to follow for readers familiar with DSA topics:

# DSA
Implementations of data structures and algorithms 🧰


## 1. Sliding Window

### [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters)

**File:** `LongestSubstringWithoutRepeatingCharacters.java`

#### How It Works (Sliding Window with HashSet)
Variables:

start: Marks the start index of the current window (substring).

maxLength: Stores the maximum length found so far.

charSet: A HashSet that keeps track of the characters in the current window, ensuring all are unique.

Outer Loop (end):
We use another pointer, end, to mark the end of the current substring window. end traverses from 0 to the end of the string.

Inner While Loop:
For each character at position end, if it's already in charSet, that means we've found a duplicate in the current window.
To remove the duplicate, we repeatedly remove characters from the set starting from start and move start forward until there's no duplicate.

Add Character:
After making sure there are no duplicates in the window, add the character at end to the set.

Update Maximum Length:
Calculate the current window length: end - start + 1.

Update maxLength if this window's length is greater.

Return Result:
Finally, return maxLength as the answer.