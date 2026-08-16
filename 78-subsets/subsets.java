class Solution {


static void  subsetgen(int [] arr , List<Integer>current , List<List<Integer>> result , int i ){

if(i==arr.length){
   result.add(new ArrayList<>(current));
   return;
}

//element include //
current.add(arr[i]);
subsetgen(arr,current,result , i+1);

current.remove(current.size()-1);
//exclude//
subsetgen(arr,current,result , i+1);
}


    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> result = new ArrayList<>();
     List<Integer> current = new ArrayList<>();
     subsetgen(nums,current,result,0);
     return result;
    }
}