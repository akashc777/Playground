#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u;
  cin>>u;
  if (u<=200)
 {
    cout<<"Rs."<<(int)(0.5*u);
  }
  else if(u <= 400)
  {
    cout<<"Rs."<<(int)(0.65*u+100);
  }
  else if(u <= 600)
  {
    cout<<"Rs."<<(int)(0.80*u+200);
  }
  else
  {
    cout<<"Rs."<<(int)(1.25*u+425);
  }
}