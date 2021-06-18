/*
    This is an implementation of Stacks using Arrays 
*/
#include <bits/stdc++.h>
#define MAX_SIZE 101
using namespace std;


class Stack
{
    int A[MAX_SIZE];
    int top;
public:
    Stack(){ top = -1; };
    void Push(int x);
    void Pop();
    int Top(){ return A[top]; };
    void Print();
};



void Stack::Push(int x){
    if(top == MAX_SIZE-1){
        cout<< "Error: stack overflow\n";
        return;
    }
    A[++top] = x;
}

void Stack::Pop(){
    if(top == -1){
        cout<< "Error: stack underflow\n";
        return;
    }
    top--;
}

int Stack::Top(){
    return A[top];
}

void Stack::Print(){
    cout<< "Stack:  ";
    for (int i = 0; i <= top; i++)
        cout<< A[i] << " ";
    cout<< endl;
}

int main(){
    Stack s;
    s.Push(2);
    s.Push(4);
    s.Print();
    s.Pop();
    s.Print();
    s.Push(5);
    s.Push(9);
    s.Push(3);
    s.Print();
    s.Pop();
    s.Print();
    return 0;
}