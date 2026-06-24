class Solution {
    public int subtractProductAndSum(int n) {
        int p = n;
        int product=1;
        int sum = 0;

        while(p>0){
            int digit = p%10;
            p = p/10;
            product = product*digit;
        }

        while(n>0){
            int digit = n%10;
            n = n/10;
            sum = sum + digit;
        }

        int ans = product - sum;

        return ans;
    }
}