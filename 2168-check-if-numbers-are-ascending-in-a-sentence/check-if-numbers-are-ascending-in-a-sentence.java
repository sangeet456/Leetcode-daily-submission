class Solution {
    public boolean areNumbersAscending(String s) {
        int prev = -1;
        String [] check = s.split(" ");
        for(int i=0;i<check.length;i++){
            if(Character.isDigit(check[i].charAt(0))){
                int curr = Integer.parseInt(check[i]);

                 if(curr<=prev) return false;
           else  prev = curr;
            }
           

        }
    return true;}
}