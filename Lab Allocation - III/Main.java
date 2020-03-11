#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x, y, z, n, count=0;
  cin>>x>>y>>z>>n;
  
  if(n <= x)
  {
  	count++;
  }
  if(n <= y)
  {
  	count++;
  }
  if(n <= z)
  {
  	count++;
  }
  cout<<count;
}