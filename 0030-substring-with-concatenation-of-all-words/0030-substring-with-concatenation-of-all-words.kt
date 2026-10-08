class Solution {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val result = mutableListOf<Int>()
        if (s.isEmpty() || words.isEmpty()) return result
        
        val w = words[0].length
        val n = words.size
        val need = HashMap<String, Int>()
        for (word in words) {
            need[word] = need.getOrDefault(word, 0) + 1
        }
        
        for (i in 0 until w) {
            var left = i
            var count = 0
            val seen = HashMap<String, Int>()
            
            var right = i
            while (right + w <= s.length) {
                val word = s.substring(right, right + w)
                
                if (need.containsKey(word)) {
                    seen[word] = seen.getOrDefault(word, 0) + 1
                    count++
                    
                    // Remove excess occurrences from the left
                    while (seen[word]!! > need[word]!!) {
                        val leftWord = s.substring(left, left + w)
                        seen[leftWord] = seen[leftWord]!! - 1
                        count--
                        left += w
                    }
                    
                    // Found a valid window
                    if (count == n) {
                        result.add(left)
                        // Slide left forward by one word
                        val leftWord = s.substring(left, left + w)
                        seen[leftWord] = seen[leftWord]!! - 1
                        count--
                        left += w
                    }
                } else {
                    // Invalid word -> reset the window
                    seen.clear()
                    count = 0
                    left = right + w
                }
                
                right += w
            }
        }
        
        return result
    }
}