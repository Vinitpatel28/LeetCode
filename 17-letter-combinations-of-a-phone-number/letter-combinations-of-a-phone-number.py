class Solution:
    def letterCombinations(self, digits):
        if not digits:
            return []

        digit_to_chars = ['abc', 'def', 'ghi', 'jkl', 'mno', 'pqrs', 'tuv', 'wxyz']

        result = []

        def backtrack(index, path):
    
            if index == len(digits):
                result.append(''.join(path))
                return

            letters = digit_to_chars[int(digits[index]) - 2]
            for letter in letters:
                path.append(letter) 
                backtrack(index + 1, path)  
                path.pop()  
 
        backtrack(0, [])
        return result

if __name__ == "__main__":
    solution = Solution()
    
    # Test case 1
    print(solution.letterCombinations("23"))  # Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    
    # Test case 2
    print(solution.letterCombinations(""))      # Output: []
    
    # Test case 3
    print(solution.letterCombinations("2"))     # Output: ["a","b","c"]
