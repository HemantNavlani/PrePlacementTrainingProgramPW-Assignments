public class Q4 {

    //leetcode 2215
    //https://leetcode.com/problems/find-the-difference-of-two-arrays/
    //class Solution {
    //    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    //        List<List<Integer>> ans = new ArrayList<>();
    //          List<Integer> l = new ArrayList<>();
    //        for (int i=0;i<nums1.length;i++){
    //            boolean flag = false;
    //            for (int j=0;j<nums2.length;j++){
    //                if (nums1[i]!=nums2[j]){
    //                    flag = true;
    //                }
    //                else {
    //                    flag = false;
    //                    break;
    //                }
    //            }
    //            if(flag) {
    //                if (!(l.contains(nums1[i])))
    //                l.add(nums1[i]);
    //            }
    //        }
    //        ans.add(l);
    //          List<Integer> l1 = new ArrayList<>();
    //        for (int i=0;i<nums2.length;i++){
    //            boolean flag = false;
    //            for (int j=0;j<nums1.length;j++){
    //                if (nums2[i]!=nums1[j]){
    //                    flag = true;
    //                }
    //                else{
    //                    flag = false;
    //                    break;
    //                }
    //            }
    //            if(flag) {
    //                 if(flag) {
    //                if (!(l1.contains(nums2[i])))
    //                l1.add(nums2[i]);
    //            }
    //            }
    //
    //        }
    //
    //        ans.add(l1);
    //
    //        return ans;
    //    }
    //}
}
