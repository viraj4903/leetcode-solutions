class Solution {
    public int maximumPopulation(int[][] logs) {
        
        int population=0;
        int max=-1;
        int earliest=0;

        for(int i=1950;i<2051;i++){           
            for(int j=0;j<logs.length;j++){
                if(i==logs[j][0]){
                    population++;
                }
                if(i==logs[j][1]){
                    population--;
                }
            }
            if(population>max){
                max=population;
                earliest = i;
            }
        }
        return earliest;
    }
}