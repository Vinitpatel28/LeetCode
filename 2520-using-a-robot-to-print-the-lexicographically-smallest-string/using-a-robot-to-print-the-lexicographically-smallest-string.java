import java.util.*;

class Solution {
    public String robotWithString(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] minCharFrom = new char[n];
        minCharFrom[n - 1] = s.charAt(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            minCharFrom[i] = (char) Math.min(s.charAt(i), minCharFrom[i + 1]);
        }
        int i = 0;
        while (i < n) {
            stack.push(s.charAt(i));
            while (!stack.isEmpty() && (i == n - 1 || stack.peek() <= minCharFrom[i + 1])) {
                res.append(stack.pop());
            }
            i++;
        }
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.toString();
    }
}
