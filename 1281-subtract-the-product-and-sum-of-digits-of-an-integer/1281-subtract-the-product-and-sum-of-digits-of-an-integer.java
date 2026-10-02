class Solution {
    public int subtractProductAndSum(int n) {
        int org = n;
        int product =1;
        int sum =0;
        while(org >0){
            int digit = org%10;
            product *=digit;
            sum += digit;
            org=org/10;
        }

return product - sum;
    }
}