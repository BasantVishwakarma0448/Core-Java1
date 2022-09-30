#include<iostream>
using namespace std;
int main(){
	int i, a[30], n;
	cout<<"enter value of n: ";
	cin>>n;
	while(n>0){
		a[i]=n%2;
		n=n/2;
		++i;
	}
	for(i=i-1; i>=0; --i){
		cout<<a[i]<<endl;
	}
}
