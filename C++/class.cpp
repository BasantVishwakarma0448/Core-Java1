#include<iostream>
using namespace std;
class human{
	private:
	string name;
	public:
		void main(){
			cout<<"Enter your name: ";
			cin>>name;
		}
	
};
class student:public human{
	public:
		
		void getdetails(){
			int id;
			cout<<"Enter your id: ";
			cin>>id;
			cout<<"ID: "<<id;
		}
		void set(human h){
			h.main();
			
		}
};
int main(){
	student s;
s.set(s);
	s.getdetails();
}
