#include <iostream>
using namespace std;

int main(){
	long long int i, n, m, a, b, k, max=0;
	cin>> n >> m;
	long long int arr[n];
	for(i=0;i<n;i++){
		arr[i] = 0;
	}
	while(m--){
		cin>> a >> b >> k;
		for(i=(a-1);i<b;i++){
			arr[i] += k;
			if(max < arr[i]) max = arr[i];
			//cout<< "arr[i] = " << arr[i] << endl;
			//cout<< "max = " << max << endl;
		}
	}
	cout<< max;
	return 0;    
}