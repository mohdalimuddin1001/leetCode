object Solution {
    def isPalindrome(x: Int): Boolean = {
        val xArray = x.toString
        def helper(nIndex: Int, reverseIndex: Int, isTrue: Boolean): Boolean = {
                  if (xArray.length == 1) true
                    else if (reverseIndex <= nIndex) isTrue
                    else if (xArray(nIndex) == xArray(reverseIndex)) helper(nIndex + 1, reverseIndex - 1, true)
                    else if (xArray(nIndex) != xArray(reverseIndex)) false
                    else isTrue
        }
        helper(0, xArray.length - 1, false)
    }
}