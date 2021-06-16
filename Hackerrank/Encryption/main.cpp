#include<iostream>
#include<cmath>
#include<string>
#include<algorithm>

using namespace std;

int main(){
	string str, ans;
	cin>> str;
	int i,k,n,a;
	str.erase(remove(str.begin(), str.end(), ' '), str.end());
	n = str.length();
	a = (int)sqrt(n);
	if(a*a == n) a--;
	for(i=0; i< a+1; i++){
		ans.clear();
		for(k=i; k<n; k= k+a+1){
			ans = ans + str[k];
		}
		cout<< ans << ' ';
	}
	
	return 0;
}