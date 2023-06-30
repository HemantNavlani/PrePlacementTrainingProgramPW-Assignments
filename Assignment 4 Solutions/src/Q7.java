public class Q7 {
    //leetcode 598
    //https://leetcode.com/problems/range-addition-ii/


    //correct approach
    //class Solution {
    //    public int maxCount(int m, int n, int[][] ops) {
    //        for (int i=0;i<ops.length;i++){
    //            int a = ops[i][0];
    //            int b = ops[i][1];
    //            m= Math.min(a,m);
    //            n= Math.min(b,n);
    //        }
    //        return m*n;
    //    }
    //
    //}

    //partially correct approach
    //class Solution {
    //    public int maxCount(int m, int n, int[][] ops) {
    //        int maxcount =m*n;
    //        for (int i=0;i<ops.length;i++){
    //            int product = ops[i][0]*ops[i][1];
    //            if (maxcount>product){
    //                maxcount = product;
    //            }
    //        }
    //        return maxcount;
    //    }
    //
    //}

    
    //Brute force but memory limit exceeded
    //class Solution {
    //    public int maxCount(int m, int n, int[][] ops) {
    //        int [][] arr = new int [m][n];
    //        int max = 0;
    //        for (int i=0;i<ops.length;i++){
    //                int a = ops[i][0];
    //                int b = ops[i][1];
    //                for (int j=0;j<a;j++){
    //                    for (int k=0;k<b;k++){
    //                        int q = arr[j][k];
    //                        arr[j][k]=q+1;
    //                    }
    //            }
    //            max++;
    //        }
    //        int count =0;
    //        for (int i=0;i<arr.length;i++){
    //            for (int j=0;j<arr[i].length;j++){
    //                if (arr[i][j]==max){
    //                    count++;
    //                }
    //            }
    //        }
    //        return count;
    //    }
    //}
}