public class Q3 {
    //leetcode 941
    //https://leetcode.com/problems/valid-mountain-array/
    //
    //class Solution {
    //    public boolean validMountainArray(int[] arr) {
    //        int i=0;
    //        if (arr.length>1){
    //        if (arr[0]>arr[1]){
    //            return false;
    //        }
    //        }
    //        while (i<=arr.length-2){
    //            if(arr[i]==arr[i+1]) return false;
    //            else if (arr[i]<arr[i+1])i++;
    //            else break;
    //        }
    //        if(i==arr.length-1) return false;
    //        int j=i+1;
    //        while (j<=arr.length-2){
    //            if(arr[j]==arr[j+1]) return false;
    //            else if (arr[j]>arr[j+1]) j++;
    //            else break;
    //        }
    //        if (j==arr.length-1) return true;
    //        return false;
    //    }
    //}
}
