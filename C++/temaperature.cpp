#include<iostream>
using namespace std;
int main(){
	float T, n, celsius;
	cout<<"Enter Temaperature: ";
	cin>>T;
	cout<<"This Temaperature is converting in the celsius....."<<endl;
	celsius = (T-32)*(0.5556);
	cout<<"Temperature in celsius is: "<<celsius;
}
