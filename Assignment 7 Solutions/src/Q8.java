public class Q8 {
    //leetcode 1232
    //https://leetcode.com/problems/check-if-it-is-a-straight-line/
//class Solution {
//    public boolean checkStraightLine(int[][] coordinates) {
//        int n = coordinates.length;
//        if ((coordinates[n-1][0]-coordinates[0][0])==0) {
//            for (int i=0;i<n;i++){
//            if (coordinates[i][0]!=coordinates[0][0]){
//                return false;
//            }
//        }
//        }
//        else{
//            float m = (float) (coordinates[n - 1][1] - coordinates[0][1]) / (float) (coordinates[n - 1][0] - coordinates[0][0]);
//        float c = coordinates[n-1][1] - m*coordinates[n-1][0];
//        for (int i=0;i<n;i++){
//            if (coordinates[i][1]!=m*coordinates[i][0]+c){
//                return false;
//            }
//        }
//        return true;
//    }
//    return true;
//}
//
//}
}
