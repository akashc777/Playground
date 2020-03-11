#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int na, nb, nc, c;
  cin>>na>>nb>>nc>>c;
  if(na%c == 0)
  {
    cout<<"Car 1 goes into road A";
  }
  else if(nb%c == 0)
  {
    cout<<"Car 1 goes into road B";
  }
  else if(nc%c == 0)
  {
    cout<<"Car 1 goes into road C";
  }
  else
  {
    cout<<"No path exist";
  }
  
}