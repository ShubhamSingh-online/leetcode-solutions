/*
Problem: 13. Roman to Integer
Difficulty: Easy

Link:
https://leetcode.com/problems/roman-to-integer/

Approach:
- Traverse the Roman numeral from left to right.
- Convert each Roman symbol to its corresponding integer value using a switch statement.
- Compare the current symbol with the next symbol.
- If the current value is smaller than the next value, subtract it from the total.
- Otherwise, add it to the total.
- Return the final integer value.

Time Complexity: O(n)
n = Length of the Roman numeral string

Space Complexity: O(1)
*/

class Solution {
    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = 0;

            switch (s.charAt(i)) {
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'M':
                    current = 1000;
                    break;
            }

            if (i < s.length() - 1) {

                int next = 0;

                switch (s.charAt(i + 1)) {
                    case 'I':
                        next = 1;
                        break;
                    case 'V':
                        next = 5;
                        break;
                    case 'X':
                        next = 10;
                        break;
                    case 'L':
                        next = 50;
                        break;
                    case 'C':
                        next = 100;
                        break;
                    case 'D':
                        next = 500;
                        break;
                    case 'M':
                        next = 1000;
                        break;
                }

                if (current < next) {
                    total -= current;
                } else {
                    total += current;
                }

            } else {
                total += current;
            }
        }

        return total;
    }
}
