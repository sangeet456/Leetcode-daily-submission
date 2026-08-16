class Solution {
    static void getsubset(int[] arr, List<List<Integer>> result, List<Integer> current, int i) {
        if (i == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        //make a  //include// 
        current.add(arr[i]);
        getsubset(arr, result, current, i + 1);
        //make a //exclude//
        //remove duplicates //
        int idx = i;
        current.remove(current.size() - 1);
        while (idx < arr.length - 1 && arr[idx] == arr[idx + 1]) {
            idx++;
        }

        getsubset(arr, result, current, idx + 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        getsubset(nums, result, current, 0);

        return result;
    }
}