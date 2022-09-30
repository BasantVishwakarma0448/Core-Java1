#include<iostream>
using namespace std;
class human{
	protected:
	string name;
	public:
		void getdata(){
		cout<<"Enter your name: ";
		cin>>name;
			cout<<"Your name is: "<<name<<endl;
		}
};
int main(){
	human h;
	h.getdata();

}
