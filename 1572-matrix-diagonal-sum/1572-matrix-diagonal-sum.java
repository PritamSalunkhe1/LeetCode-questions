class Solution {
    public int diagonalSum(int[][] mat) {
        int pri = 0;
        int sec = 0;
        int n = mat.length;
        int i = 0,j=0;
        while (i<n){
            pri += mat[i][j];
            i++;
            j++;
        }
        i = 0; j = n-1;
        while (i<n){
            sec += mat[i][j];
            i++;
            j--;
        }
        if (n %2 == 0){
            return pri +sec;
        }
        else {
            return pri+sec-mat[n/2][n/2];
        }
    }
}