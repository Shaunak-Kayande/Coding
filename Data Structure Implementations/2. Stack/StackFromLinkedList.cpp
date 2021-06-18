/*
    Program implementing stacks using linked lists
*/
#include <bits/stdc++.h>
using namespace std;

class Stack{

    class StackNode{
        public:
        int data;
        StackNode* next;
    };
    StackNode* root = NULL;

    public:

    void push(int x){
        StackNode* newNode = new StackNode();
        newNode->data = x;
        newNode->next = root;
        root = newNode;
        cout<< x << " pushed into stack\n";
    }

    int pop(){
        if(root == NULL){
            cout<< "Error: Stack Underflow";
            return 0;
        }
        StackNode* temp = root;
        root = temp->next;
        int popped = temp->data;
        free(temp);
        return popped;
    }

    int peak(){
        return root->data;
    }

    void print(){
        StackNode* temp = root;
        cout<< "Stack: ";
        while(temp != NULL){
            cout<< temp->data << " ";
            temp = temp->next;
        }
        cout<< endl;
    }
};

int main(){
    Stack s;
    while(true){
        cout<< "1.Push, 2.Pop, 3.Print, 4.Peak, 5.Done\n";
        int c, n;
        cin>> c;
        switch (c)
        {
        case 1:
            cout<< "Enter an element: ";
            cin>> n;
            s.push(n);
            s.print();
            break;

        case 2:
            n = s.pop();
            cout<< n << " popped from stack\n";
            s.print();
            break;

        case 3:
            s.print();
            break;

        case 4:
            n = s.peak();
            cout<< n << endl;
            break;
        
        case 5:
            return 0;
            break;

        default:
            break;
        }
    }
    return 0;
}