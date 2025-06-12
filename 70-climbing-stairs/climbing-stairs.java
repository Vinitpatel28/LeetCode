class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        
        int a = 1; // f(1)
        int b = 2; // f(2)
        int c = 0;
        
        for (int i = 3; i <= n; i++) {
            c = a + b; // f(i) = f(i-1) + f(i-2)
            a = b;
            b = c;
        }
        
        return b;
    }
}
