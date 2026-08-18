class Solution {

static boolean isprime(int x){
    if(x<2) return false;
    if(x==2) return true;
    if(x%2 == 0) return false;
    for(int i=3; i*i<=x ; i++){
        if(x%i==0) return false;;
    }
return true;}



static int reverse(int n){
    int rev =0;
    while(n>0){
        int digit = n%10;
        rev = rev * 10 + digit;
        n=n/10;
    }
return rev ;
}


    public int sumOfPrimesInRange(int n) {
        int r = reverse(n);
        int x = Math.min(n,r);
        int y = Math.max(n,r);
     int sum =0;
     for(int i=x ; i<=y ; i++){
        if(isprime(i)){
            sum += i;
        }
     }
     return sum;
    }
}