#include <bits/stdc++.h>
using namespace std;

class Solution{   
public:

    int countLessThanOrEqualToNum(vector<int> &row, int n, int m){
        int mid, high= n -1, low=0;
        
        while(low <= high){
            mid = (low+high)/2;
            if(m >= row[mid]) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
    
    int median(vector<vector<int>> &matrix, int r, int c){
        // code here    
        int max= 1, min=2000, mid, n, i, j;
        
        for(i=0; i<r; i++){
            if(matrix[i][0] < min) min = matrix[i][0];
            if(matrix[i][c-1] > max) max = matrix[i][c-1];
        }

        int desired = (r*c)/2;
        while(min <= max){
            mid = (min + max)/2;
            n = 0;
            for(j=0; j<r; j++)
                n += countLessThanOrEqualToNum(matrix[j], c, mid);

            if(n <= desired) min = mid+1;
            else max = mid-1;
        }
        return min;
    }
};

// { Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int r, c;
        cin>>r>>c;
        vector<vector<int>> matrix(r, vector<int>(c));
        for(int i = 0; i < r; ++i)
            for(int j = 0;j < c; ++j)
                cin>>matrix[i][j];
        Solution obj;
        cout<<obj.median(matrix, r, c)<<endl;        
    }
    return 0;
}