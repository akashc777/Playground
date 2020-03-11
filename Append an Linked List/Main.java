#include<iostream>
using namespace std;

struct node{
  	int val;
    node* next;
 };

int main()
{
  //type your code here
  node *head = new node();
  node *ptr;
  int input = 0;
  while(1){
    
  	cin>>input;
    if(input < 0)
      break;
    ptr = head;
    while(ptr->next != NULL){
    	ptr = ptr->next;
    }
    node *n = new node();
    n->val = input;
   
    ptr->next = n;
  }
    ptr = head->next;
    while(ptr != NULL){
    	cout<<ptr->val<<"\n";
      	ptr = ptr->next;
    }
    
  
  return 0;
}