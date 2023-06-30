public class Q1 {
    //leetcode 205
    //https://leetcode.com/problems/isomorphic-strings/

    //class Solution {
    //    public boolean isIsomorphic(String s, String t) {
    //        HashMap<Character,Character> mp = new HashMap<>();
    //        HashSet<Character> st = new HashSet<>();
    //        for (int i=0;i<s.length();i++){
    //            if (mp.containsKey(s.charAt(i))){
    //                if (mp.get(s.charAt(i))!=t.charAt(i)){
    //                    return false;
    //                }
    //            }
    //            else if (st.contains(t.charAt(i))){
    //                return false;
    //            }
    //            else {
    //                mp.put(s.charAt(i),t.charAt(i));
    //                st.add(t.charAt(i));
    //            }
    //        }
    //        return true;
    //    }
    //}

}
