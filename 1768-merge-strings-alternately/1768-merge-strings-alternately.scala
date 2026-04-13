object Solution {
    def mergeAlternately(word1: String, word2: String): String = {
        val sb = new StringBuilder
        val word1Length = word1.length
        val word2Length = word2.length
        def helper(i: Int, j: Int, str: StringBuilder): StringBuilder = {
        if (i >= word1Length && j >= word2Length) str
        else if (j >= word2Length) helper(i + 1, j, str.append(word1(i)))
        else if (i >= word1Length) helper(i, j + 1, str.append(word2(j)))
        else helper(i + 1, j + 1, str.append(word1(i)).append(word2(j)))
        }
        helper(0, 0, sb).toString()
    }
}