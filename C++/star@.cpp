#include<iostream>
using namespace std;
int main(){
	int i, j, k, n;
	cout<<"Enter number to make pyramid: ";
	cin>>n;
	for(i=1; i<=n; ++i){
		for(j=1; j<=(n-i); ++j){
			cout<<" ";
		}
		for(k=1; k<=(i*2-1); ++k){
			cout<<"*";
		}
		cout<<endl;
	}
	
}
