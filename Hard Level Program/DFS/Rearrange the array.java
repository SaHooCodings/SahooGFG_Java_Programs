class Solution{
    public:
    int rearrange_array(vector<int> arr){
        //code here
    int n = arr.size();
        vector<int>ans;
        vector<bool> vis(n);
        for(int i=0; i<n; i++){
            if(vis[arr[i]-1] == true)
                continue;
                
            int start = arr[i];
            int curr = arr[i];
            int len = 0;
            do {
                vis[curr-1] = true;
                curr = arr[curr-1];
                len++;
            } while (start != curr);
            ans.push_back(len);
        }
        while(ans.size()>1)
        {
            long long x=ans.back();
            ans.pop_back();
            long long y=ans.back();
            ans.pop_back();
            long long z= (x*y)/(__gcd(x,y));
            z=z%1000000007;
            ans.push_back((int)z);
        }
        return (int)(ans[0]);
    }
};
