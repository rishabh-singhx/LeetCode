class Solution {
public:
    int sumDivisibleByK(vector<int>& nums, int k) {
        int n = nums.size();

        map<int, int> freq;
        for (auto it : nums) {
            freq[it]++;
        }

        int res = 0;
        for (auto it : freq) {
            if (it.second % k == 0) {
                res += it.first * it.second;
            }
        }

        return res;
    }
};