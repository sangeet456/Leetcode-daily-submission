class Solution {
    public boolean checkIfPangram(String sentence) {
       HashSet<Character> sets = new HashSet<>();
       char[] arr = sentence.toCharArray();
       for(char ch : arr){
        sets.add(ch);
       }
   return sets.size()==26; }
}