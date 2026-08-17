

class Element implements Comparable<Element>{
    char ch;
    int freq;
    
    public Element(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
    
    public int compareTo(Element that){
        return that.freq - this.freq; 
    }
}

class Solution {
    public String frequencySort(String s) {
       
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        
        
        PriorityQueue<Element> pq = new PriorityQueue<>();
        for(Map.Entry<Character, Integer> entry : mp.entrySet()){
            pq.offer(new Element(entry.getKey(), entry.getValue()));
        }
        
       
        StringBuilder result = new StringBuilder();
        while(!pq.isEmpty()){
            Element e = pq.poll();
            for(int i = 0; i < e.freq; i++){
                result.append(e.ch);
            }
        }
        
        return result.toString();
    }
}