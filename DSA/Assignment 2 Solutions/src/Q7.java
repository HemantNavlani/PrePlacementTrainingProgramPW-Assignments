public class Q7 {
    //leetcode 896
    //https://leetcode.com/problems/monotonic-array/
    //class Solution {
    //    public boolean isMonotonic(int[] nums) {
    //        int flag = -1;
    //        for (int i=0;i<nums.length-1;i++){
    //            if (nums[i]<nums[i+1]){
    //                flag = 0;
    //                break;
    //            }
    //            else if (nums[i]>nums[i+1]){
    //                flag = 1;
    //                break;
    //            }
    //        }
    //        if (flag ==0){
    //            for (int i = 1;i<nums.length-1;i++){
    //                if (nums[i]>nums[i+1]) return false;
    //            }
    //            return true;
    //        }
    //        else if (flag ==1) {
    //            for (int i = 1;i<nums.length-1;i++){
    //                if (nums[i]<nums[i+1]) return false;
    //            }
    //            return true;
    //        }
    //        else if (flag==-1) return true;
    //        return false;
    //    }
    //}
}
