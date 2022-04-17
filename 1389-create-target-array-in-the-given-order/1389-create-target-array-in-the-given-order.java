class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = index.length;
        int ans[] = new int[n];
        for (int i = 0 ; i <n;i++){
            solve(ans,nums[i],index[i],i);
        }
        return ans;
    }
    
    public void solve(int[] ans,int value, int index, int val){
        for (int i = val ; i >index;i--){
            ans [i] = ans [i-1];
        }
        ans[index] = value;
    }
}