public class Q3 {
    //leetcode 35
    //https://leetcode.com/problems/search-insert-position/
    //class Solution {
    //    public int searchInsert(int[] nums, int target) {
    //        int start= 0;
    //        int end = nums.length-1;
    //        if (target>nums[nums.length-1]) return nums.length;
    //        else if(target<nums[0]) return 0;
    //        while(start<=end){
    //            int mid = start+(end-start)/2;
    //            if (target>nums[mid]){
    //                start=mid+1;
    //            }
    //            else if (target<nums[mid]){
    //                end=mid-1;
    //            }
    //            else {
    //                return mid;
    //            }
    //        }
    //        return end+1;
    //        }
    //}
}
