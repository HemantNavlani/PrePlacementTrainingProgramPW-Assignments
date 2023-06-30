public class Q7 {
    //leetcode 844
    //https://leetcode.com/problems/backspace-string-compare/

//    class Solution {
//        public boolean backspaceCompare(String s, String t) {
//            for (int i=0;i<s.length();i++){
//                if (s.charAt(i)=='#'){
//                    if (i==0) s = s.substring(i+1);
//                    else  s=s.substring(0,i-1)+s.substring(i+1);
//                    i=-1;
//                }
//            }
//            for (int i=0;i<t.length();i++){
//                if (t.charAt(i)=='#'){
//                    if (i==0) t = t.substring(i+1);
//                    else t=t.substring(0,i-1)+t.substring(i+1);
//                    i=-1;
//                }
//            }
//            return s.equals(t);
//        }
//    }
}
