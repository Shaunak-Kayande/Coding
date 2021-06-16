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

void insertNode(int n, int i){
    Node* temp = new Node();
    temp->data = n;
    Node* temp1 = head;
    for(int j=0; j<i-2; j++){
        temp1 = temp1->next;
    }
    temp->next = temp1->next;
    temp1->next = temp;
}

void deleteNode(int i){
    Node* temp = head;
    for (int j = 0; j < i-2; j++){
        temp = temp->next;
    }
    Node* temp1 = temp->next;
    temp->next = temp->next->next;
    free(temp1);
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

int getCount(Node* temp){
    if(temp == NULL) return 0;
    else return 1 + getCount(temp->next);
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
    cout<< "Input elements for linked list or type \"-1\" to continue\n";
    int n, c, i;
    while (true){    
        cin>> n;
        if(n == -1) break;
        else insertNode(n);
    }

    while(true){
        cout<< "Input a num: 1. Insert at ith position, 2. Delete at ith positon, 3. Total elements in LL, 4. Reverse LL by Itarative method, 5. Reverse LL by recursive method, 0. Done:\n";
        cin>> c;
        if(c==0) break;
        switch (c)
        {
        case 1:
            cout<< "Input element and position: ";
            cin>> n >> i;
            insertNode(n, i);
            print();
            break;
        
        case 2: 
            cout<< "Input position: ";
            cin>> i;
            deleteNode(i);
            cout<< "Deleted at" << i << "th positon\n";
            print();
            break;

        case 3:
            cout<< "Total elements of linked list are: " << getCount(head) << endl;
            break;

        case 4:
            reverseItr();
            cout<< "Reversing linked list by Itarative method\n";
            print();
            break;

        case 5:
            reverseRecur(head);
            cout<< "Reversing linked list by Recursive method\n";
            print();
            break;

        default:
            break;
        }   
    }
}