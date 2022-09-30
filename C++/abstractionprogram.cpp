#include<iostream>
using namespace std;
class student{
	private: 
	string passcode = "TEACHER@1998";
	public:
		void teacher(){
			string n;
			cout<<"Enter passcode to changes: ";
			cin>>n;
			if(n=="TEACHER@1998"){
				cout<<"You can change, where you won't|";
			}
			else{
				cout<<"Please enter correct passcode|";
			}
		}
};
int main(){
	student s;
	s.teacher();
}
