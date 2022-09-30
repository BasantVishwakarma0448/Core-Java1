#include<iostream>
using namespace std;
int add(){
	int a, b;
	cout<<"Enter value of a: ";
	cin>>a;
	cout<<"Enter value of b: ";
	cin>>b;
	cout<<a+b;
}
int sub(){
	int a, b;
	cout<<"Enter value of a: ";
	cin>>a;
	cout<<"Enter value of b: ";
	cin>>b;
	cout<<a-b;
}
int multi(){
	int a, b;
	cout<<"Enter value of a: ";
	cin>>a;
	cout<<"Enter value of b: ";
	cin>>b;
	cout<<a*b;
}
int div(){
	float a, b;
	cout<<"Enter value of a: ";
	cin>>a;
	cout<<"Enter value of b: ";
	cin>>b;
	cout<<a/b;
}
int main(){
	int n;
	
	cout<<"1.Addition"<<endl;
	cout<<"2.Substraction"<<endl;
	cout<<"3.Multiplication"<<endl;
	cout<<"4.Division"<<endl;
	cout<<"Enter number to performing operation: ";
	cin>>n;
	if(n==1){
		add();
	}
	else if(n==2){
		sub();
	}
	else if(n==3){
		multi();
	}
	else if(n==4){
		div();
	}
	else if(n<=0){
		cout<<"Enter correct input...";
	}
	else if(n>4){
		cout<<"Enter correct input...";
	}
	else{
		cout<<"Please check value of a & b...";
	}
}
