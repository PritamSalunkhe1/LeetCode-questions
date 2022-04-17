class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        for(int i =0; i<indices.length ; i++){
                solve(ans,indices[i]);
        }
        int count = 0;
        for (int i = 0; i<m;i++){
            for(int j = 0;j<n;j++){
                if(ans[i][j]%2 !=0){
                    count++;
                }
            }
        }
        return count;
    }
    
    static void solve(int[][] arr, int[] in){
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0 ; i<c;i++){
            arr[in[0]][i]++;
        }
        for(int i=0 ; i<r;i++){
            arr[i][in[1]]++;
        }
        
    }
}