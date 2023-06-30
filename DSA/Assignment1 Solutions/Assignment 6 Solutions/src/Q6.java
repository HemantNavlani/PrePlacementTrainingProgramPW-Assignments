public class Q6 {
    //leetcode 2007

    //https://leetcode.com/problems/find-original-array-from-doubled-array/

    //TLE occurs here

    //class Solution {
    //    public int[] findOriginalArray(int[] changed) {
    //          Arrays.sort(changed);
    //        int [] ans = new int[changed.length/2];
    //        int k=0;
    //        for (int i=0;i<changed.length;i++){
    //            // Arrays.sort(changed);
    //            if (changed[i]==-1) continue;
    //            boolean flag = false;
    //            int s = 0;
    //            int e = changed.length-1;
    //            int target = changed[i]*2;
    //            // while (s<=e){
    //            //     int mid = s+(e-s)/2;
    //            //     if (changed[mid]==target && i!=mid){
    //            //         ans[k++]=changed[i];
    //            //         changed[i]=-1;
    //            //         changed[mid]=-1;
    //            //         flag=true;
    //            //         break;
    //            //     }
    //            //     else if (changed[mid]>target){
    //            //         e=mid-1;
    //            //     }
    //            //     else{
    //            //         s=mid+1;
    //            //     }
    //            // }
    //
    //
    //            for (int j=0;j<changed.length;j++){
    //                if (i!=j){
    //                if (changed[j]==-1) continue;
    //                if (changed[j]==2*changed[i]){
    //                    ans[k++]=changed[i];
    //                    changed[j]=-1;
    //                    changed[i]=-1;
    //                    flag = true;
    //                    break;
    //                }
    //            }
    //            }
    //
    //
    //            if (!flag && changed[i]%2!=0){
    //                return new int[] {};
    //            }
    //        }
    //        for (int i=0;i<changed.length;i++){
    //            if(changed[i]!=-1) return new int []{};
    //        }
    //        return ans;
    //    }
    //}
}
