#include <bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node* next;
};
Node* head;

void insertNode(int n){
    Node* temp = new Node();
    temp->data = n;
    temp->next = head;
    head = temp;
}

void reverseItr(){
    Node* temp = head;
    Node* temp1;
    Node* prev = NULL;
    while(temp != NULL){
        temp1 = temp->next;
        temp->next = prev;
        prev = temp;
        temp = temp1;
    }
    head = prev;
}

void reverseRecur(Node* p){
    if(p->next == NULL){
        head = p;
        return;
    }
    reverseRecur(p->next);
    Node* q = p->next;
    q->next = p;
    p->next = NULL;
}

void print(){
    Node* temp = head;
    while(temp != NULL){
        cout<< temp->data << " ";
        temp = temp->next;
    }
    cout<< "\n";
}

int main(){
    cout<< "Input elements for linked list or type \"-1\"\n";
    int n;
    while (true){    
        cin>> n;
        if(n == -1) break;
        else insertNode(n);
    }
    print();
    cout<< "Reversing linked list by Itarative method\n";
    reverseItr();
    print();
    cout<< "Reversing linked list by Recursive method\n";
    reverseRecur(head);
    print();
}