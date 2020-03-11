#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  cin>>x>>y>>z;
  if(x<y && x<z)
  {
  	cout<<"L1";
  }
   if(y<z && y<x)
  {
  	cout<<"L2";
  }
   if(z<y && z<x)
  {
  	cout<<"L3";
  }
}