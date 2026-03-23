object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val numsLength = nums.length

        def helper(nIndex: Int, nIndex2: Int): Array[Int] = {
        if (nIndex >= numsLength) Array.emptyIntArray
        else if (nIndex2 >= numsLength) helper(nIndex + 1, nIndex + 2)
        else if (nums(nIndex) + nums(nIndex2) == target)  Array(nIndex, nIndex2)
        else helper(nIndex, nIndex2 + 1)
        }

        helper(0, 1)
    }
}