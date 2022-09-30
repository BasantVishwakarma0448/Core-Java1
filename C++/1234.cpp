#include<iostream>
using namespace std;
class Rbi{
	public:
		int balance=2000, withdrawl;
		void method(){
				
				cout<<"Enter amount to withdraw: ";
				cin>>withdrawl;
				cout<<"Your total balance: "<<balance+withdrawl<<endl;
		}
};
class sbi:public Rbi{
	public:
		void  checkbalance(){
			cout<<"SBI your balance is: "<<balance<<endl;
		}
		void withdraw(){
			cout<<"Enter amount to withdraw from sbi: ";
			cin>>withdrawl;
		}
		void withdrwal(){
			cout<<"SBI your clr balance after withdrawling: "<<balance-withdrawl;
		}
};
int main(){
	Rbi r;
	sbi s;
	
	s.withdraw();
	
	s.withdrwal();
}
