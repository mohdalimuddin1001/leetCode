object Solution {
    def moveZeroes(nums: Array[Int]): Unit = {
        val nLength = nums.length
        def helper(i: Int, j: Int): Unit = {
        if (j >= nLength) return 
        if (nums(j) != 0) {
            val temp = nums(i)
            nums(i) = nums(j)
            nums(j) = temp
            helper(i + 1, j + 1)
        } else helper(i, j + 1)
        }
        helper(0, 0)
    }
}