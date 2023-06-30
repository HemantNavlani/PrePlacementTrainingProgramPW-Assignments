import java.util.ArrayList;

public class Q7 {
    //leetcode 163 (Prememium)
    //https://github.com/doocs/leetcode/blob/main/solution/0100-0199/0163.Missing%20Ranges/README_EN.md

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> listoflist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int lower = 0;
        int upper = 99;
        int []arr = {0,1,3,50,75};
        if (arr[0]!=lower){
            list.add(lower);
            list.add(arr[0]-1);
            listoflist.add(list);
        }
        for (int i=0;i<=arr.length-2;i++){
            ArrayList<Integer> l = new ArrayList<>();
            if (arr[i+1]==arr[i]+1){
                continue;
            }
            else{
                l.add(arr[i]+1);
                l.add(arr[i+1]-1);
                listoflist.add(l);
            }
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        if (arr[arr.length-1]!=upper){
            list1.add(arr[arr.length-1]+1);
            list1.add(upper);
            listoflist.add(list1);
        }

        System.out.println(listoflist);
    }
}
