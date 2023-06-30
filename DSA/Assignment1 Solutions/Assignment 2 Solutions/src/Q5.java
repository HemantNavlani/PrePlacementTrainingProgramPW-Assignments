public class Q5 {
    //leetcode 628
    //https://leetcode.com/problems/maximum-product-of-three-numbers/
    //class Solution {
    //    public int maximumProduct(int[] nums) {
    //        int n=nums.length;
    //        Arrays.sort(nums);
    //
    //        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
    //    }
    //}



    //Other approach

    //class Solution {
    //    public int maximumProduct(int[] nums) {
    //        int min1 = Integer.MAX_VALUE;
    //        int min2 = Integer.MAX_VALUE;
    //        int max1 = Integer.MIN_VALUE;
    //        int max2 = Integer.MIN_VALUE;
    //        int max3 = Integer.MIN_VALUE;
    //        for(int i=0;i<nums.length;i++){//1,-1,0,3
    //            if(nums[i]<=min1){
    //                min2=min1;
    //                min1=nums[i];
    //        }else if (nums[i]<=min2){
    //            min2=nums[i];
    //        }
    //        if (nums[i]>max1){
    //            max3=max2;
    //            max2=max1;
    //            max1=nums[i];
    //        }
    //        else if (nums[i]>max2){
    //            max3=max2;
    //            max2=nums[i];
    //        }
    //        else if (nums[i]>max3){
    //            max3=nums[i];
    //        }
    //        }
    //        return Math.max(min1*min2*max1,max1*max2*max3);
    //    }
    //}
}
