#include<iostream>
#include<set>
using namespace std; 

int main(){
	int n, m, i, j;
	set<int, greater<int>> ranked;
	cin>> n;
	while(n--){
		cin>> i;
		ranked.insert(i);
	}
	n = ranked.size();
	/*int arr[n];
	set<int> ::iterator it;
	it = ranked.begin();
	i = 0;
	while(it != ranked.end()){
		arr[i] = *it;
		it++;
		i++;
	}*/
	cin>> m;
	while(m--){
		cin>> j;
		/*i = 0;
		while(n--){
			if(j >= arr[i])break;
			i++;
		}
		cout<< i+1 << endl; */
		ranked.insert(j);
		i= std::distance(set.begin(), ranked.find(j));
		cout<< i+1 << endl;
	}
	return 0;
}

