class Solution {
    public boolean rotateString(String s, String goal) {
        int m = s.length();
        int n = goal.length();
        if(m!=n) return false;
        String str ="";
            str = s+s;
            if(str.contains(goal)){
                return true;
            }

    return false;}
}