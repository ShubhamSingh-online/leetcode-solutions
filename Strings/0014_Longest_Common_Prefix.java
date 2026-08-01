/*
Problem: 14. Longest Common Prefix
Difficulty: Easy

Link:
https://leetcode.com/problems/longest-common-prefix/

Approach:
- Use the first string as the reference.
- Traverse each character of the first string.
- Compare the current character with the character at the same position in every other string.
- If a mismatch is found or any string ends, return the common prefix found so far.
- If no mismatch occurs, the first string itself is the longest common prefix.

Time Complexity: O(m × n)
m = Length of the first string
n = Number of strings

Space Complexity: O(1)
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {

            char current = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() || strs[j].charAt(i) != current) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}
