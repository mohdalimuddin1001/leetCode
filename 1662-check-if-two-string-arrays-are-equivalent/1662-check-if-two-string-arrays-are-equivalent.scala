object Solution {
    def arrayStringsAreEqual(word1: Array[String], word2: Array[String]): Boolean = {
        val str1 = new StringBuilder
        val str2 = new StringBuilder
        def getWordLength(word: Array[String]) = word.length
        def helper(index: Int, word: Array[String], wordLength: Int, str: StringBuilder): StringBuilder = {
        if (index >= wordLength) str
        else helper(index + 1, word, wordLength, str.append(word(index)))
        }
        helper(0, word1, getWordLength(word1), str1) == helper(0, word2, getWordLength(word2), str2)
    }
}