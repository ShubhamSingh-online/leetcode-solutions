/*
Problem: 7. Reverse Integer
Difficulty: Medium

Link:
https://leetcode.com/problems/reverse-integer/

Approach:
- Extract the last digit using modulo (% 10).
- Remove the last digit using division (/ 10).
- Build the reversed number by multiplying the current result by 10 and adding the extracted digit.
- Return 0 if reversing causes integer overflow.

Time Complexity: O(d)
d = Number of digits (maximum 10 for a 32-bit integer)

Space Complexity: O(1)
*/

class Solution {
    public int reverse(int x) {
        int revNum = 0;

        while (x != 0) {
            int lastNum = x % 10;
            x = x / 10;

            if (revNum > Integer.MAX_VALUE / 10 || revNum == Integer.MAX_VALUE) {
                return 0;
            }

            if (revNum < Integer.MIN_VALUE / 10 || revNum == Integer.MIN_VALUE) {
                return 0;
            }

            revNum = revNum * 10 + lastNum;
        }

        return revNum;
    }
}
