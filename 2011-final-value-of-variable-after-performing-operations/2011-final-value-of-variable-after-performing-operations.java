class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x =0;
        for(String data : operations){
            if(data.charAt(1)=='+'){
                x++;
            }else{
                x--;
            }
        }
        return x;
        
    }
}