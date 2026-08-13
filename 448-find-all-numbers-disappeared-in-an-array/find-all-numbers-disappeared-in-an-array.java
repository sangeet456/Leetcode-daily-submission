class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        Arrays.sort(nums);
        for(int ele : nums){
            h.add(ele);
        }
        List<Integer> l = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!h.contains(i)) l.add(i);
        }
    return l ;
    }
}