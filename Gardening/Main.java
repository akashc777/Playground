#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  cout<<((a < c && c<=(a*2) ) || (c > (a*(b-2)) &&  c <= (a*(b-1)))?"It is a mango tree":"It is not a mango tree" );
}