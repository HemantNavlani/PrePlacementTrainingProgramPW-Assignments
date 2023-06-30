public class Q7 {
    //leetcode 59
    //https://leetcode.com/problems/spiral-matrix-ii/description/
    //class Solution {
    //    public int[][] generateMatrix(int n) {
    //        int[][] ans = new int[n][n];
    //        int val = 1;
    //        int left = 0;
    //        int right = n-1;
    //        int up = 0;
    //        int down = n-1;
    //        while (val<=n*n){
    //            for (int i=left;i<=right && val<=n*n;i++){
    //                ans[up][i]=val++;
    //            }
    //            up++;
    //            for (int i=up;i<=down && val<=n*n;i++){
    //                ans[i][right]=val++;
    //            }
    //            right--;
    //            for (int i=right;i>=left && val<=n*n;i--){
    //                ans[down][i]=val++;
    //            }
    //            down--;
    //            for(int i=down;i>=up && val<=n*n;i--){
    //                ans[i][left]=val++;
    //            }
    //            left++;
    //        }
    //        return ans;
    //    }
    //}
        }
