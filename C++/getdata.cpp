#include<iostream>
using namespace std;
class human{
	public: 
	string name;
	int age;
	
	
	void setdata(string n, int a){
		name = n;
		age = a;
	}
	
	
	void getdata(){
		cout<<"Name: "<<name<<endl<<"Age: "<<age<<endl;
	}
	void getDatafromuser(){
		cout<<"Enter your name: ";
		cin>>name;
		cout<<"Enter your age: ";
		cin>>age;
		setdata(name, age);
}
};
int main(){
	int n, i;
	cout<<"Enter the number of memories to alocate: ";
	cin>>n;
	for(i=1; i<=n; ++i){
		getDatafromuser();
	}
}
