#include <bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node* next;
    Node* prev;
};
Node* head;
Node* tail;

Node* getNewNode(int x){
    Node* newNode = new Node();
    newNode->data = x;
    newNode->next = NULL;
    newNode->prev = NULL;
    return newNode;
}

void insertAtHead(int x){
    Node* newNode = getNewNode(x);
    if(head == NULL){
        head = newNode;
        tail = newNode;
        return;
    }
    newNode->next = head;
    head->prev = newNode; 
    head = newNode;
}

void insertAtTail(int x){
    Node* newNode = getNewNode(x);
    if(tail == NULL){
        head = newNode;
        tail = newNode;
        return;
    }
    newNode->prev = tail;
    tail->next = newNode;
    tail = newNode;
}

void reverseItr(){
    Node* temp = head;
    Node* nextNode = NULL;
    while(temp != NULL){
        nextNode = temp->next;
        temp->next = temp->prev;
        temp->prev = nextNode;
        temp = nextNode;
    }
    temp = head;
    head = tail;
    tail = head;
}

void reverseRecur(Node* p){

    if(p == NULL) return;

    if(p->next == NULL){
        tail = head;
        head = p;
    }
    
    reverseRecur(p->next);
    Node* q = p->next;
    p->next = p->prev;
    p->prev = q;
    
}

void printList(){
    Node* temp = head;
    while(temp != NULL){
        cout<< temp->data << " ";
        temp = temp->next;
    }
    cout<< endl;
}

int main(){
    cout<< "Input elements for linked list or type \"-1\" to continue\n";
    int n, c, i;
    while (true){    
        cin>> n;
        if(n == -1) break;
        else insertAtHead(n);
    }
    printList();

    while(true){
        cout<< "Input a num: 1. Insert at end, 2. Reverse LL by Itarative method, 3. Reverse LL by recursive method, 0. Done:\n";
        cin>> c;
        if(c==0) break;
        switch (c)
        {
        case 1:
            cout<< "Input element: ";
            cin>> n;
            insertAtTail(n);
            printList();
            break;
        
        case 2:
            reverseItr();
            cout<< "Reversing linked list by Itarative method\n";
            printList();
            break;

        case 3:
            reverseRecur(head);
            cout<< "Reversing linked list by Recursive method\n";
            printList();
            break;

        default:
            break;
        }   
    }
    return 0;
}



