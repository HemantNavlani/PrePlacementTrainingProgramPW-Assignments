import java.util.Arrays;

public class Q5 {
    //leetcode 1874
    //https://leetcode.ca/2021-07-19-1874-Minimize-Product-Sum-of-Two-Arrays/
    public static void main(String[] args) {
        int []nums1={5,3,4,2};
        int []nums2={4,2,2,5};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int product=0;
        for (int i=0;i<nums1.length;i++){
             product += nums1[i]*nums2[nums1.length-1-i];
        }
        System.out.println(product);
    }
}
