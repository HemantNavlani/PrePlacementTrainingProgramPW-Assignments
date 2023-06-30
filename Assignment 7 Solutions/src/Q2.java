import java.util.Scanner;

public class Q2 {
    //leetcode premium 246 --> Strobogrammatic Number
    //Given a string num which represents an integer, return true *if* num *is a **strobogrammatic number
    //A strobogrammatic number** is a number that looks the same when rotated 180 degrees (looked at upside down).
    //Input: num = "69"
    //Output:
    //true
    public static void main(String[] args) {
        //0,1,6,8,9
        Scanner in  = new Scanner(System.in);
        String num = in.next();
        for (int i=0;i<num.length();i++){
            if (num.charAt(i)!='0' && num.charAt(i)!='1'&&num.charAt(i)!='6'&&num.charAt(i)!='8'&&num.charAt(i)!='9'){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
