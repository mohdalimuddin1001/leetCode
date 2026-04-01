object Solution {
    import scala.collection.mutable
    import scala.util.chaining.scalaUtilChainingOps
    def majorityElement(nums: Array[Int]): Int = {
        val numsLength = nums.length
        def helper(index: Int, countMap: mutable.Map[Int, Int]): mutable.Map[Int, Int] = {
        if (index >= numsLength) countMap
        else {
            if (countMap.contains(nums(index))) {
            helper(index + 1, countMap.tap(_(nums(index)) = countMap.getOrElse(nums(index), 0) + 1))
            } else {
            helper(index + 1, countMap += (nums(index) -> 1))
            }
        }
        }

        helper(0, mutable.Map.empty[Int, Int]).maxBy(_._2)._1
    }
}