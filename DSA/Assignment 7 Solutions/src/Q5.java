import java.util.Collections;

public class Q5 {
    //leetcode 541
    //https://leetcode.com/problems/reverse-string-ii/

    //class Solution {
    //    public String reverseStr(String s, int k) {
    //        char[] ch = s.toCharArray();
    //        if (k>=s.length()){
    //            StringBuilder ans = new StringBuilder(s);
    //            ans = ans.reverse();
    //            return ans.toString();
    //        }
    //        int k2 = 2*k;
    //        int rem = s.length()-k2;
    //        int i=0;
    //        int j=k-1;
    //        while(i<j){
    //            char temp = ch[i];
    //            ch[i]=ch[j];
    //            ch[j]=temp;
    //            i++;
    //            j--;
    //        }
    //        if (rem<k){
    //            int a = k2;
    //            int b = s.length()-1;
    //            while(a<b){
    //                char temp = ch[a];
    //                ch[a]=ch[b];
    //                ch[b]=temp;
    //                a++;
    //                b--;
    //            }
    //        }
    //        if (rem>=k && rem<k2){
    //            int a = k2;
    //            int b = k2+k-1;
    //            while (a<b){
    //                 char temp = ch[a];
    //                ch[a]=ch[b];
    //                ch[b]=temp;
    //                a++;
    //                b--;
    //            }
    //        }
    //        String str = new String(ch);
    //        if (rem>k2)
    //        return str.substring(0,k2) + reverseStr(str.substring(k2),k);
    //        return str;
    //    }
    //}
}
