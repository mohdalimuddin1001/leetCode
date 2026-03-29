object Solution {
    def lengthOfLastWord(s: String): Int = {
        val wordsArray = s.split("\\s+")
        val lastWord = wordsArray.last
        def helper(word: String, count: Int): Int = {
        if (word.isEmpty) count
        else helper(word.tail, count + 1)
        }
        helper(lastWord, 0)
    }
}