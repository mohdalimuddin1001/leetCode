object Solution {
    def reverseString(s: Array[Char]): Unit = {
        val sLength = s.length
        def helper(i: Int, j: Int): Array[Char] = {
        if (i > j) s
        else {
            val temp = s(i)
            s(i) = s(j)
            s(j) = temp
            helper(i + 1, j - 1)
        }
        }
        helper(0, sLength - 1)
    }
}