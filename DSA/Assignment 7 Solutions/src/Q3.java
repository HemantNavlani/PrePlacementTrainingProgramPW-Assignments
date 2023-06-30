import java.util.Locale;

public class Q3 {
    //leetcode 415
    //https://leetcode.com/problems/add-strings/
//class Solution {
//    public String addStrings(String num1, String num2) {
//        int i = num1.length()-1;
//        int j = num2.length()-1;
//        StringBuilder str = new StringBuilder();
//        int carry=0;
//        while (i>=0 || j>=0){
//            if (i>=0 && j>=0){
//                int sum = (int) num1.charAt(i) + (int) num2.charAt(j)-96;
//                if (carry==1) sum+=1;
//                if (sum>9) carry = 1;
//                else carry = 0;
//                str.append(sum%10);
//                i--;
//                j--;
//            }
//            else if (i>=0){
//                int sum = (int) num1.charAt(i)-48;
//                if (carry==1) sum+=1;
//                if (sum>9) carry = 1;
//                else carry = 0;
//                str.append(sum%10);
//                i--;
//            }
//            else if (j>=0){
//                int sum = (int) num2.charAt(j)-48;
//                if (carry==1) sum+=1;
//                if (sum>9) carry = 1;
//                else carry = 0;
//                str.append(sum%10);
//                j--;
//            }
//        }
//        if (carry==1) str.append(1);
//        return str.reverse().toString();
//    }
//}
}
