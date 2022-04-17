class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0 ; 
        for (int i = 0 ; i<nums.length; i++){
          if (isEvenDigit(nums[i])){
              ans ++;
          }  
        }
        return ans;
    }
    static Boolean isEvenDigit(int n){
        int count = 0;
        while (n!=0){
            count++;
            n /= 10;
        }
        return count % 2 == 0;
        
    }
}