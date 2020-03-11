#include<iostream>
#include<string>
#include <cstring>
using namespace std;
int main()
{
  //Type your code here.
  int l1, l2, l3;
  char fl[2]; 
  cin>>l1>>l2>>l3>>fl;

  if(strcmp(fl,"L1") == 0)
  {
  	if(l2<l3)
      cout<<"L2";
    else
      cout<<"L3";
  }
  else if(strcmp(fl,"L2") == 0)
  {
  	if(l3<l1)
      cout<<"L3";
    else
      cout<<"L1";
  }
   else if(strcmp(fl,"L3") == 0)
  {
  	if(l2<l1)
      cout<<"L2";
    else
      cout<<"L1";
  }
}