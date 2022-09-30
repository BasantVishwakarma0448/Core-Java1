#include<iostream>
#include<string.h>
//#include<stdio.h>
using namespace std;
int main(){
	int n=0,i=0;
	cout<<"Enter the number of students: ";
	cin>>n;
	int admno[n];
	char* name[n];
	float eng[n], maths[n], hindi[n];
	
	
	for(i=0; i<n; ++i){
		cout<<"Enter name: ";
		cin>>name[i];
		cout<<"Enter Admission number: ";
		cin>>admno[i];
	//	getchar();
		
		cout<<"Enter numbers of english, maths & hindi: ";
		cin>>eng[i]>>maths[i]>>hindi[i];
		
	}
	for(i=0; i<n; ++i){
		cout<<"Admission number: "<<admno[i]<<endl;
		cout<<"Name: "<<name[n]<<endl;
		cout<<"English: \t"<<eng[i]<<"maths: \t"<<maths[i]<<"Hindi: \t"<<hindi[i]<<endl;
	
	}
}
