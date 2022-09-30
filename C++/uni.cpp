#include<iostream>
using namespace std;
class human{
	private: 
	int password=1234;
	public:
	void person(){
		int balance=2000;
			cout<<"Enter password: ";
		cin>>password;
		if(password==1234){
			cout<<"clr balance: "<<balance;
		}
	}
};
class SBI:public human{
	public:
		void sbi(human r){
			r.person();
		}
		void checkbalance(){
			int balance=balance, credit;
			cout<<"Your clear balance: "<<(balance+credit);
		}
};
int main(){
	SBI s;
	human r;
	s.sbi(human r);
	s.checkbalance();
	
}
