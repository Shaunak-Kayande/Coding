#include <iostream>
using namespace std; 

int main(){
	long long int sum = 0, min = -1, max = 0, a;
	for(int i = 0; i<5; i++){
		cin>> a;
		sum = sum + a;
		if(a > max) max = a;
		if(a < min || min == -1) min = a;
	}
	cout<< sum - max << " " << sum - min << endl;
}