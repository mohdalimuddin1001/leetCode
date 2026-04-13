object Solution {
    def moveZeroes(nums: Array[Int]): Unit = {
        val nLength = nums.length
        def helper(i: Int, j: Int, nArray: Array[Int]): Array[Int] = {
        if (j >= nLength) nArray
        else {
            if (nArray(j) != 0) {
            val temp = nArray(i)
            nArray(i) = nArray(j)
            nArray(j) = temp
            helper(i + 1, j + 1, nArray)
            } else helper(i, j + 1, nArray)
        }
        }
        helper(0, 0, nums)
    }
}