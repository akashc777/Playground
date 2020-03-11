#include<iostream>
#include <algorithm> 
using namespace std;
bool comp(int a, int b) 
{ 
    return (a < b); 
} 
int main()
{
  //Type your code here.
  int fa, fd, fs, sa, sd, ss, aa, ad, as;
  float flip, snap, ama;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  flip = fa*(1-((float)fd/100)) + fs;
  snap = sa*(1-((float)sd/100)) + ss;
  ama = aa*(1-((float)ad/100)) + as;
  cout<<"In Flipkart Rs."<<flip;
   cout<<"\nIn Snapdeal Rs."<<snap;
   cout<<"\nIn Amazon Rs."<<ama;

  if(flip < ama && flip <snap )
  {
  	cout<<"\nHe will prefer Flipkart";
  }
    if(snap < ama && snap <flip )
  {
  	cout<<"\nHe will prefer Snapdeal";
  }
    if(ama < flip&& ama <snap )
  {
  	cout<<"\nHe will prefer Amazon";
  }
  //cout<<"\n He will prefer "<<min;
}

