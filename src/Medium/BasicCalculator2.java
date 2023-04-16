package Medium;

import java.util.Stack;

/**
 * Given a string s which represents an expression, evaluate this expression and return its value.
 *
 * The integer division should truncate toward zero.
 *
 * You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].
 *
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
 *
 * Constraints:
 *
 * 1 <= s.length <= 3 * 105
 * s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
 * s represents a valid expression.
 * All the integers in the expression are non-negative integers in the range [0, 231 - 1].
 * The answer is guaranteed to fit in a 32-bit integer.
 */

public class BasicCalculator2 {

    public int calculate(String s) {
        int len = 0;
        int num = 0;
        Stack<Integer> stack = new Stack<>();
        char sign = '+';
        int res = 0;

        if(s == null || (len = s.length()) == 0) return 0;

        for(int i = 0; i < len; i++) {
            if(Character.isDigit(s.charAt(i)))
                num = num * 10 + s.charAt(i) - '0';

            if(!Character.isDigit(s.charAt(i)) && ' ' != s.charAt(i) || i == len -1) {
                if(sign == '-')
                    stack.push(-num);
                if(sign == '+')
                    stack.push(num);
                if(sign == '*')
                    stack.push(stack.pop() * num);
                if(sign == '/')
                    stack.push(stack.pop() / num);
                sign = s.charAt(i);
                num = 0;
            }

        }
        for(int i : stack)
            res += i;
        return res;


    }
}
