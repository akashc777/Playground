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
  cout<<"Before inserting the value:\n";
   ptr = head->next;
    while(ptr != NULL){
    	cout<<ptr->val<<"\n";
      	ptr = ptr->next;
    }
  
  int v, pos, c=1;
  cin>>pos>>v;
   node *n = new node();
    n->val = v;
  ptr = head;
  while(c != (pos+1)){
  	ptr = ptr->next;
    c++;
  }
  
  cout<<"Enter the position and value to be inserted:\n";
  n->next = (ptr->next); 
  ptr->next = n;
  
  cout<<"After inserting the value:\n";
   ptr = head->next;
    while(ptr != NULL){
    	cout<<ptr->val<<"\n";
      	ptr = ptr->next;
    }
  return 0;
}