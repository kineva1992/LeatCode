package Easy;

public class BinarySearch {

    /**
     * 704. Binary Search
     * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
     *
     * You must write an algorithm with O(log n) runtime complexity.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [-1,0,3,5,9,12], target = 9
     * Output: 4
     * Explanation: 9 exists in nums and its index is 4
     * Example 2:
     *
     * Input: nums = [-1,0,3,5,9,12], target = 2
     * Output: -1
     * Explanation: 2 does not exist in nums so return -1
     *
     *
     * Constraints:
     *
     * 1 <= nums.length <= 104
     * -104 < nums[i], target < 104
     * All the integers in nums are unique.
     * nums is sorted in ascending order.
     *
     * @param nums
     * @param target
     * @return
     */

    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        return sb(nums, left, right, target);


    }

    private int sb(int[] nums,int left, int right, int target){
        if(left > right) return -1;
        int mid = left + (right - left) / 2;

        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return sb(nums,left, mid - 1, target);
        else return sb(nums, mid + 1, right, target);


    }
}
