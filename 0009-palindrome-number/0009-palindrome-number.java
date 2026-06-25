class Solution {
    public boolean isPalindrome(int x) {

        int n = x;
        int rev=0;
        
        while(x>0){
            int digit = x%10;
            x=x/10;
            rev=rev*10 + digit;
        }

        if(rev==n){
            return true;
        }

        return false;
    }
}