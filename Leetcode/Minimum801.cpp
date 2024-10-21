class Solution {
public:
    int sol(vector<int>& nums1, vector<int>& nums2,int index, bool swapped  ){
      
        if (index == nums1.size()) {
            return 0;
        }
        int ans = INT_MAX;
        int prev1 = nums1[index - 1];
        int prev2 = nums2[index - 1];

        //swapped
        if(swapped ){
            swap(prev1,prev2);
        }
        

        // No swap
        if (nums1[index] > prev1 && nums2[index] > prev2) {
            ans = sol(nums1, nums2, index + 1, 0);
        }

        //swapped
        if(nums1[index]>prev2 && nums2[index]>prev1){
            ans = min(ans,1+sol(nums1,nums2,index+1,1));
        }
        return ans;


    }
    int minSwap(vector<int>& nums1, vector<int>& nums2) {
        nums1.insert(nums1.begin(),-1);
        nums2.insert(nums2.begin(),-1);
        bool swapped =0;
        return sol(nums1,nums2,1,swapped);
    }
};