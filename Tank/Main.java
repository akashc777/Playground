#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float r, h, wph, ha;
  cin>>r>>h>>wph>>ha;
  float vol = 3.14*r*r*h, hr = vol/wph;
  //cout<<vol<<"\t"<<ha;
  if(hr <= ha)
  {
    cout<<"The tank can be filled within "<<ha<<" hours";
  }
  else
  {
  	cout<<"The tank cannot be filled within "<<ha<<" hours";
  }
}