#include<iostream>
using namespace std;
int main(){
	int n, i;
	cout<<"Enter value of n: ";
	cin>>n;
	for(i=1; i<=n; ++i){
		cout<<i<<"X"<<i<<"="<<i*i<<endl;
	}
}
