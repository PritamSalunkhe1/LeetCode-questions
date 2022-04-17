class Solution {
    public boolean isPalindrome(int n) {
        if(n<0){
            return false;
        }
        else{
            int actual = n;
        int ans = 0;
        while (n != 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        return actual == ans;
        }
    }
}