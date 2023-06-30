public class Q3 {
    //leetcode 31
    //https://leetcode.com/problems/next-permutation/
    //class Solution {
    //    public void nextPermutation(int[] nums) {
    //        int i=-1;
    //        for (i=nums.length-1;i>0;i--){
    //            if (nums[i]>nums[i-1]){
    //                for(int j=nums.length-1;j>=i;j--){
    //                    if (nums[j]>nums[i-1]){
    //                        int temp = nums[i-1];
    //                        nums[i-1]=nums[j];
    //                        nums[j]=temp;
    //                        break;
    //                    }
    //                }
    //                int a = i,b=nums.length-1;
    //                while(a<b){
    //                    int temp = nums[a];
    //                    nums[a]=nums[b];
    //                    nums[b]=temp;
    //                    a++;
    //                    b--;
    //                }
    //                break;
    //            }
    //        }
    //        if (i==0){
    //             int a = 0,b=nums.length-1;
    //                while(a<b){
    //                    int temp = nums[a];
    //                    nums[a]=nums[b];
    //                    nums[b]=temp;
    //                    a++;
    //                    b--;
    //                }
    //        }
    //    }
    //}
}
