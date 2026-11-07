class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<vector<int>>ans;
        for(int i = 0;i<rowIndex+1;i++){
            vector<int>cur;
            long long val = 1;
            for(int j = 0;j<=i;j++){
                cur.push_back(val);
                val = val*(i-j)/(j+1);
            }
            ans.push_back(cur);
        }
        return ans[ans.size()-1];
        
    }
};