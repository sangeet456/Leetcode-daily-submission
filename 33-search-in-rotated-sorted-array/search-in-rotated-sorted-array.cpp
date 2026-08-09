class Solution {
public:
    int search(vector<int>& arr, int target) {
        unordered_map<int, int> mp;

        for (int i = 0; i < arr.size(); i++) {
            mp[arr[i]] = i;
        }

        if (mp.find(target) != mp.end())
            return mp[target];

        return -1;

    }
};