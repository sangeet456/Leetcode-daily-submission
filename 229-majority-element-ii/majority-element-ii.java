class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int ele : nums){
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        }
        List<Integer> l = new ArrayList<>();
        int size = nums.length;
        for(int key : mp.keySet()){
            if(mp.get(key) > size/3) l.add(key);
        }
   return l; }
}