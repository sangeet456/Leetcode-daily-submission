class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> result = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])) {  
                    count++;
                }
            }
            if(count == 1) {
                result.add(arr[i]);  
            }
        }
        
        if(k <= result.size()) {
            return result.get(k-1); 
        }
        return "";
    }
}