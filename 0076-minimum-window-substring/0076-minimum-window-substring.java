class Solution {
    public String minWindow(String s, String t) {
        int total = t.length();
        Map<Character , Integer> m= new HashMap<>();
        for(int i =0;i<t.length();i++){
            char c = t.charAt(i);  
            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }
            else{
                m.put(c,1);
            }

        }

        int start =0 , end =0 , ans = Integer.MAX_VALUE , idx=-1;

        while(end<s.length()){
            char c = s.charAt(end);
            if(m.containsKey(c)){
                int oldvalue = m.get(c);
                m.put(c, oldvalue-1); 
                //if previously positive
                if(oldvalue>0) total --;
            }
            else{
                m.put(c,-1);
            }
            while(total==0 && start<=end){
                //update the length of the substring//
                if(ans > end-start +1){  
                    ans = end - start +1;  
                    idx=start;
                }
                char leftchar = s.charAt(start);
                int leftoldvalue = m.get(leftchar);
                m.put(leftchar, leftoldvalue + 1);

                if(leftoldvalue == 0) total ++;  // count total 
                start ++;
            }
          end ++;

        }      
        if(idx==-1) return "";
        
        String str = "";
        for(int i = idx; i < idx + ans; i++){
            str += s.charAt(i);  
        }  
        return str;
    }
}