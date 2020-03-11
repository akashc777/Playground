#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int wl, wb, p1l, p1b, p2l, p2b;
  cin>>wl>>wb>>p1l>>p1b>>p2l>>p2b;
  if(p1b+p2b <= wb && p1l<=wl && p2l<=wl)
  {
  	cout<<"Raj can fix both painting";
  }
  else if(p1l+p2l <= wl && p1b<=wb && p2l<=wb)
  {
  	cout<<"Raj can fix both painting";
  }
  else
  {
    cout<<"Raj cannot fix both painting";
  }
}