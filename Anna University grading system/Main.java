#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int g;
  cin>>g;
  if(g>100)
  {
  	cout<<"Invalid Input";
    return 0;
  }
  if(g <50)
  {
  	cout<<"F";
  }
  else if(g < 60)
  {
  	cout<<"E";
  }
  else if(g < 70)
  {
  	cout<<"D";
  }
   else if(g < 80)
  {
  	cout<<"C";
  }
   else if(g < 90)
  {
  	cout<<"B";
  }
   else if(g < 100)
  {
  	cout<<"A";
  }
  else
    cout<<"S";
}