class Solution {

private static boolean find(int arr[] , int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target) return true;
    }
return false;}



    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(find(nums2,nums1[i]) || find(nums3,nums1[i])){
                hash.add(nums1[i]);
            }
        }
            for(int i=0;i<nums2.length;i++){
                if(find(nums1,nums2[i])|| find(nums3,nums2[i])){
                    hash.add(nums2[i]);
                }
            }
            for(int i =0;i<nums3.length;i++){
                if(find(nums1,nums3[i]) || find(nums2,nums3[i])){
                    hash.add(nums3[i]);
                }
            }
return new ArrayList<>(hash);
        }
    }
