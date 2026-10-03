class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost =0;
        int start=0;
        for(int val : gas){
            totalgas+=val;
        }
        for(int val : cost){
            totalcost+= val;
        }
        if(totalgas<totalcost) return -1;
        int currgas =0;
        for(int i=0;i<gas.length;i++){
            currgas+= gas[i]-cost[i];
            if(currgas<0){
                start =i+1;
                currgas=0;
            }
        }
   return start; }
}