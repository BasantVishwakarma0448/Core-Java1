#include<iostream>
using namespace std;
int main(){
	int a, b;
	cout<<"Enter value of a: ";
	cin>>a;
	cout<<"Enter value of b: ";
	cin>>b;
	a=a+b;
	b=a-b;
	a=a-b;
	cout<<"a = "<<a<<endl<<"b = "<<b;
}
