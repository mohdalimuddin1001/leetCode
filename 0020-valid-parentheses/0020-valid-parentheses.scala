object Solution {
    def isValid(s: String): Boolean = {
    val sArray = s.toCharArray
    val length = sArray.length
    val openingChar = Map('(' -> 1, '[' -> 2, '{' -> 3)
    val closingChar = Map(')' -> 1, ']' -> 2, '}' -> 3)

    def helper(index: Int, s: Array[Int]): Array[Int] = {
      if (index >= length) s
      else if (closingChar.keys.exists(_ == sArray(index)) && s.nonEmpty && s.last == closingChar.getOrElse(sArray(index), 0)) helper(index + 1, s.init)
      else if (closingChar.keys.exists(_ == sArray(index)) && s.nonEmpty && s.last != closingChar.getOrElse(sArray(index), 0))
        Array(' ')
      else if (openingChar.keys.exists(_ == sArray(index))) {
        val value = openingChar.getOrElse(sArray(index), 0)
        helper(index + 1, s :+ value)
      }
      else {
        Array(' ')
      }
    }
    helper(0, Array.emptyIntArray).isEmpty
    }
}