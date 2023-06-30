import java.util.ArrayList;

public class Q6 {
    //https://leetcode.com/problems/find-all-duplicates-in-an-array/
    //leetcode 442
    //class Solution {
    //    public List<Integer> findDuplicates(int[] nums) {
    //        List<Integer> l = new ArrayList<>();
    //        int i=0;
    //        while(i<nums.length){
    //            if (nums[i]==i+1) i++;
    //            else if (nums[i]==-1) i++;
    //            else if (nums[nums[i]-1]==nums[i]) {
    //                l.add(nums[i]);
    //                nums[i]=-1;
    //                i++;
    //            }
    //            else if(nums[nums[i]-1]!=nums[i]){
    //                int a = nums[i]-1;
    //                int temp = nums[i];
    //                nums[i]=nums[a];
    //                nums[a]=temp;
    //            }
    //        }
    //        return l;
    //    }
    //}
}
