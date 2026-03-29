object Solution {
    def lengthOfLastWord(s: String): Int = {
    val sReverse = s.reverse
    val sLength = sReverse.length
    def helper(s: String, count: Int, index: Int, countAchieved: Boolean): Int = {
        if (countAchieved) count
        else {
            if (sLength <= 1) helper(s, count + 1, index, true)
            else if (index == sLength && count != 0) helper(s, count, index, true)
            else if (sLength <= 2) {
            if (s(index) == ' ' && count != 0) helper(s, count,  index, true)
            else if (s(index) != ' ' && s(index).isValidChar && count != 0) helper(s, count,  + 1, false)
            else helper(s, count + 1, index, true)
            }
            else if (s(index) == ' ' && count == 0) helper(s, count, index + 1, false)
            else if (s(index) == ' ' && count != 0) helper(s, count, index, true)
            else helper(s, count + 1, index + 1, false)
        }
        }
        helper(sReverse, 0, 0, false)
    }
}