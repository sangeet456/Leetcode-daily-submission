class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int ele : nums){
            mp.put(ele , mp.getOrDefault(ele,0)+1);
        }

        for(int key : mp.keySet()){
            if(mp.get(key)==2) l.add(key);
        }
    return l;}
}