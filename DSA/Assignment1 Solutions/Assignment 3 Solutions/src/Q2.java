public class Q2 {
    //leetcode 18
    //https://leetcode.com/problems/4sum/


    //Nahi aaya properly


    //class Solution {
    //
    //    //isme dikkat ye aarahi hai ki hume ye bhi identify karna h ki do list jisme elements ka order alag hai but elements sare same hi overall toh vo ek hi time add karni hai, vo karlo toh ho gaya but bekar time complexity
    //    public List<List<Integer>> fourSum(int[] nums, int target) {
    //        List<List<Integer>> listoflist = new ArrayList<>();
    //        int n=nums.length;
    //        for (int i=0;i<n;i++){
    //            for(int j=i+1;j<n;j++){
    //                for (int k=j+1;k<n;k++){
    //                    for(int l=k+1;l<n;l++){
    //                        ArrayList<Integer> list = new ArrayList<>();
    //                        if (nums[i]+nums[j]+nums[k]+nums[l]==target){
    //                            list.add(nums[i]);
    //                            list.add(nums[j]);
    //                            list.add(nums[k]);
    //                            list.add(nums[l]);
    //                            // boolean flag = false;
    //                            // for (int a=0;a<listoflist.size();a++){
    //                            //     List<Integer> check = listoflist.get(a);//0,0,-2,2  //1,0,-1,0//check
    //                            //     // list and check should not be equal
    //                            //     for (int b=0;b<list.size();b++){
    //                            //         flag = false;
    //                            //         for (int c=0;c<check.size();c++){
    //                            //             // flag = false;
    //                            //         if (list.get(b)==check.get(c)){
    //                            //             flag = true;
    //                            //             break;
    //                            //         }
    //                            //     }
    //                            //      if (!flag) listoflist.add(list);
    //                            // }
    //                            // }
    //                            // if (!flag)
    //                            if (!listoflist.contains(list))
    //                            // if (!flag)
    //                            listoflist.add(list);
    //                        }
    //                    }
    //                }
    //            }
    //        }
    //        return listoflist;
    //    }
    //}
}
