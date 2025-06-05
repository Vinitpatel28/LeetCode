class Solution:
    def reverse(self, x):
       
        INT_MIN = -2**31
        INT_MAX = 2**31 - 1
        negative = x < 0
        x_str = str(abs(x)) 

        reversed_str = x_str[::-1]
        reversed_int = int(reversed_str)
        if negative:
            reversed_int = -reversed_int
     
        if reversed_int < INT_MIN or reversed_int > INT_MAX:
            return 0
        
        return reversed_int

if __name__ == "__main__":
    solution = Solution()
    
    print(solution.reverse(123))  
    
    print(solution.reverse(-123)) 
    
    print(solution.reverse(120)) 

    print(solution.reverse(1534236469))  
