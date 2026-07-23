class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        
        for(int i=0; i<rows; i++){
            int min = matrix[i][0];
            for(int j=0; j<cols; j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
            l1.add(min);
        }

        for(int i=0; i<cols; i++){
            int max = 0;
            for(int j=0; j<rows; j++){
                if(matrix[j][i]>max){
                    max=matrix[j][i];
                }
            }
            l2.add(max);
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(l1.get(i).equals(l2.get(j))){
                    l3.add(l1.get(i));
                    break;
                }
            }
        }
        return l3;
    }
}