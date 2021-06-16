#include<iostream>
#include<string>
using namespace std;

int main(){
    string time, dur, hr;
    int temp;
    cin>> time;
    dur = time.substr(8, 2);
    hr = time.substr(0, 2);
    if(dur == "PM" && hr != "12"){
        temp = stoi(hr) + 12;
        time.replace(0, 2, to_string(temp));
    }
    else if(dur == "AM" && hr == "12"){
        time.replace(0, 2, "00");
    } 
    cout<< time.substr(0, 8);
}
