import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q8 {
    //leetcode 252 (premium)
    //https://github.com/Seanforfun/Algorithm-and-Leetcode/blob/master/leetcode/252.%20Meeting%20Rooms.md
    public static void main(String[] args) {
//        int [][] arr = {{0,30},{5,10},{15,20}};
        int [][] arr = {{7,10},{2,4}};
        int [] startTime = new int[arr.length];
        int [] endTime = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            startTime[i]=arr[i][0];
        }
        Arrays.sort(startTime);
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (arr[j][0]==startTime[i]){
                    endTime[i]=arr[j][1];
                }
            }
        }
//        System.out.println(Arrays.toString(startTime));
//        System.out.println(Arrays.toString(endTime));
        boolean flag = false;
        for (int i=1;i< arr.length;i++){
            flag = false;
            if (startTime[i]>endTime[i-1]){
                flag=true;
            }
            if (!flag) {
                System.out.println(false);
                return;
            }
        }

        if (flag) System.out.println(true);
    }
}