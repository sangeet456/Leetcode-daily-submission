import java.util.*;

class Solution {
    public class env implements Comparable<env>{
        int w ;
        int h;
        env(int w , int h){
            this.w=w;
            this.h=h;
        }
        public int compareTo(env e){
            if(this.w == e.w) return e.h - this.h;
            return this.w - e.w;
        }
    }
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        env[] arr = new env[n];
        for(int i=0;i<n;i++){
            int w = envelopes[i][0];
            int h = envelopes[i][1];
            arr[i] = new env(w,h);
        }
        Arrays.sort(arr);

  int[] dp = new int[n];
int len = 0;

for(int i = 0; i < n; i++){
    int h = arr[i].h;

    int idx = Arrays.binarySearch(dp, 0, len, h);
    if(idx < 0) idx = -(idx + 1);

    dp[idx] = h;

    if(idx == len) len++;
}

return len;

    }
}