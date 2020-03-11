#include<iostream>
using namespace std;

struct node{
  	int val;
    node* next;
 };node *head=NULL;

int main()
{
  //type your code here
  node *ptr;
  int input = 0;
  while(1){
    
  	cin>>input;
    if(input < 0)
      break;
    ptr = head;
    
    node *n = new node();
    n->val = input;
    n->next = ptr;
   	head = n;
  }
    ptr = head;
    while(ptr != NULL){
    	cout<<ptr->val<<"\n";
      	ptr = ptr->next;
    }
    
  
  return 0;
}