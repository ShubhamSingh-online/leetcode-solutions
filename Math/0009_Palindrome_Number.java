/*
Problem: 9. Palindrome Number
Difficulty: Easy

Link:
https://leetcode.com/problems/palindrome-number/

Approach:
- Store the original number.
- Negative numbers and numbers ending with 0 (except 0 itself) cannot be palindromes.
- Reverse the digits of the number using modulo (%) and division (/).
- Check for integer overflow while constructing the reversed number.
- Compare the reversed number with the original number.

Time Complexity: O(d)
d = Number of digits (maximum 10 for a 32-bit integer)

Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(int x) {
        int realNum = x;
        int revNum = 0;

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        while (realNum != 0) {
            int lastNum = realNum % 10;
            realNum = realNum / 10;

            if (revNum > Integer.MAX_VALUE / 10 ||
               (revNum == Integer.MAX_VALUE / 10 && lastNum > 7)) {
                return false;
            }

            revNum = revNum * 10 + lastNum;
        }

        return x == revNum;
    }
}
