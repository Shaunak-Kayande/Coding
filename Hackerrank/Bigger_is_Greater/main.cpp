#include<iostream>
#include<cmath>
#include<string>
#include<bits/stdc++.h>

using namespace std;

char justgre(string p, char n){
	int i = 0;
	while(p[i] <= n){
		i++;
	}
	return p[i];
}

int main(){
	int n;
	cin>> n;
	while(n--){
		int i,l;
		char a;
		string str, sub, ans;
		cin>> str;
		int m = str.length();
		for(i=m-1; i>0; i--){
			if(str[i] > str[i-1]){
				sub = str.substr(i-1);
				l = sub.length();
				sort(sub.begin(), sub.end());
				a = justgre(sub, str[i-1]);
				ans = str.substr(0, m - l) + a;
				sub.erase(sub.begin() + sub.find(a));
				ans = ans + sub;
				cout<< ans << endl;
				break;
			}
		}
		if(i == 0) cout<< "no answer" << endl;
	}
	return 0;
}
