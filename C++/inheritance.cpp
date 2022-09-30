#include<iostream>
using namespace std;
class human{
	public:
	string name;
	int age;
	void setdetail(){
		cout<<"Enter your name: ";
		cin>>name;
		cout<<"Enter your age: ";
		cin>>age;
	}
	void display(){
		setdetail();
		cout<<"Name = "<<name<<endl<<"Age = "<<age<<endl;
	}
};
class student:public human{
	public:
	void display(){
		cout<<"Confirm your name = "<<name<<endl<<"Comnfirm your age = "<<age<<endl;
	}
	
};
int main(){
	human h;
	student s;
	h.setdetail();
	h.display();
	s.display();
}
