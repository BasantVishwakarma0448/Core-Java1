#include<iostream>
using namespace std;
class lays{
	protected:
		int num;
		string type;
		int price;
};
class shop:public lays{
	public: 
	void getdata(){
	
		
		cout<<"Enter flavour of lays: ";
		getline(cin,type);
		//getchar();
			cout<<"Enter the quantity of packets: ";
		cin>>num;
		
		cout<<"Enter the price of the packet you wont to be buy: ";
		cin>>price;
	}
	void thankyou(){
	if(price>=0&&price<=20){
		if(price/5==1.00){
			cout<<"Wait for a minute"<<endl;
		}
		
	}
	else
	cout<<"Enter right price"<<endl;
	}
};
int main(){
	shop s;
	s.getdata();
	s.thankyou();
}
