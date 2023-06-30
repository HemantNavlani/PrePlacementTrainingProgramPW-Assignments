import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q1 {
    //leetcode 1213
    //https://leetcode.ca/all/1213.html
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,5,7,9};
        int [] arr3 = {1,3,4,5,8};
        ArrayList<Integer> l = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<arr1.length && j<arr2.length && k<arr3.length){
            if (arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                l.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if(arr1[i]==arr2[j]){
                i++;
                j++;
            }
            else if (arr1[i]==arr3[k]){
                i++;
                k++;
            }
            else if (arr2[j]==arr3[k]){
                j++;
                k++;
            }
        }
        System.out.println(l);
    }
}
