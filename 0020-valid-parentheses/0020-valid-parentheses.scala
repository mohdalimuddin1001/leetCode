object Solution {
    def isValid(s: String): Boolean = {
    val sArray = s.toCharArray
    val sLength = s.length

    val openingChar = Map('(' -> 1, '[' -> 2, '{' -> 3)
    val closingChar = Map(')' -> 1, ']' -> 2, '}' -> 3)

    def helper(index: Int, isValidList: List[Int]): Option[List[Int]] = {
      if (index >= sLength) Some(isValidList)
      else if (openingChar.contains(sArray(index))) helper(index + 1, openingChar(sArray(index)) :: isValidList)
      else if (closingChar.contains(sArray(index))) {
        isValidList match {
          case h :: tail if h == closingChar(sArray(index)) => helper(index + 1, tail)
          case _ => None
        }
      }
      else None
    }

    helper(0, Nil).exists(_.isEmpty)
    }
}