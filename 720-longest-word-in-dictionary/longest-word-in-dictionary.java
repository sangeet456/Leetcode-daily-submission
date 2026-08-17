class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        HashSet<String> builtwords = new HashSet<>();
        String result ="";
        for(String w : words){
        if(w.length()==1 || builtwords.contains(w.substring(0,w.length()-1))) {
            if(w.length()>result.length())
            result = w;
        builtwords.add(w);
        }
        }
    return result;}
}