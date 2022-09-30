#include<iostream>
using namespace std;
class human{
	private:
	string name;
	public:
		void getdata(){
			cout<<"Enter your name: ";
			cin>>name;
			cout<<"your name is: "<<name<<endl;
		}
	
};
int main(){
	human h;
	h.getdata();
	
}
