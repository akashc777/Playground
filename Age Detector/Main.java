#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int br, cr;
  cin>>br>>cr;
  if(cr<br)
  {
  	cout<<(100-br)+cr;
  }
  else
    cout<<cr-br;
}