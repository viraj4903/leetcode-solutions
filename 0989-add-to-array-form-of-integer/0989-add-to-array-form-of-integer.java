class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=num.length-1; i>=0; i--){
            k += num[i];
            int digit = k%10;
            list.add(0,digit);
            k/= 10;
        }

        while(k>0){
            int digit = k%10;
            list.add(0,digit);
            k/= 10;
        }
        return list;        
    }
}