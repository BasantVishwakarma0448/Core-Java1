#include<iostream>
#include<stdio.h>
using namespace std;
class human {
	public:
	int age;
	char name[30];
	
	void setdetail(char n[30], int a){
		name[30]=n[30];
		age=a;
	}
	void getdetail(){
		cout<<"Enter Name: ";
		cin>>name;
		cout<<"Enter Age: ";
		cin>>age;
		cout<<"----------------------------"<<endl;
		cout<<"Name= "<<name<<endl<<"Age= "<<age<<endl;
	}
};
int main(){
	int i, n;
	cout<<"Enter number for store data: ";
	cin>>n;
	human *h=new human[n];
	for(i=0; i<n; ++i){
		h[i].getdetail();
	}
	
}
