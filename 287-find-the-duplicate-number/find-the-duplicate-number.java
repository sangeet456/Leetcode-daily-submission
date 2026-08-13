class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int ele : nums){
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        }

        for(int key : mp.keySet()){
            if(mp.get(key)>1){
                return key;
            }
        }
return -1;
    }
}