object Solution {
    def strStr(haystack: String, needle: String): Int = {
    val haystackArray = haystack.toCharArray
    val needleArray = needle.toCharArray
    val haystackLength = haystackArray.length
    val needleLength = needleArray.length
    def helper(haystackIndex: Int, needleIndex: Int, index: Int, start: Int): Int = {
      if (needleIndex == needleLength) index
      else if (haystackIndex >= haystackLength || needleIndex > haystackIndex) -1
      else if (needleArray(needleIndex) == haystackArray(haystackIndex)) helper(haystackIndex + 1, needleIndex + 1, index, start)
      else helper(start + 1, 0, start + 1, start + 1)
    }
    helper(0, 0, 0, 0)
    }
}