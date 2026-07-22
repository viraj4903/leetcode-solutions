class Solution {
    public int[] sumZero(int n) {
        
        int[] arr = new int[n];
        int x = 0;

        for(int i=1; i<=n/2; i++){
            arr[x] = i;
            arr[x + n/2] = -i;
            x++;
        }

        if(n%2!=0){
            arr[n-1] = 0;
        }

        return arr;
    }
}