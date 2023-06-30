public class Q8 {
    public static void main(String[] args) {
        //leetcode 311
        //https://leetcode.ca/2016-10-06-311-Sparse-Matrix-Multiplication/
        int [][]mat1 ={{1,0,0},{-1,0,-3}};
        int [][]mat2 ={{7,0,0},{0,0,0},{0,0,1}};
        int m = mat1.length;
        int n = mat2.length;
        int [][] ans = new int[m][n];
        int i=0,k=0;
        while (i<ans.length){
            int prod = 0;
            for (int j=0;j<n;j++) {
                prod += mat1[i][j] * mat2[j][k];
            }
            ans[i][k]=prod;
            k++;
            if (k==n){
                i++;
                k=0;
            }
        }
        for (int a=0;a<m;a++){
            for (int b=0;b<n;b++){
                System.out.print(ans[a][b]+" ");
            }
            System.out.println();
        }
    }
}
