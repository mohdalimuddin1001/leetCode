object Solution {
    def searchInsert(nums: Array[Int], target: Int): Int = {
        val nLength = nums.length
        def helper(i: Int, j: Int): Int = {
            if (i >= nLength) i
            else if (j <= 0) j
            else if (nums(i) == target) i
            else {
                if (nums(i) <= target && target >= nums(i)) helper(i + 1, j + 1)
                else if (nums(i) >= target && target >= nums(i)) helper(i, j + 1)
                else if (nums(i) <= target && target <= nums(i)) helper(i + 1, j)
                else i
            }
            }
        helper(0, nLength)
    }
}