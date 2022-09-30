#include<iostream>
using namespace std;
int main(){
	int k;
	cout<<"Name of Day: ";
	cin>>k;
	if(k==1){
		cout<<"Its monday today!";
	}
	else if(k==2){
		cout<<"Its tuesday today!";
	}
	else if(k==3){
		cout<<"Its wednesday today!";
	}
	else if(k==4){
		cout<<"Its thursday today!";
	}
	else if(k==5){
	cout<<"Its friday today!";
	}
	else if(k==6){
		cout<<"Its saturday today!";
	}
	else if(k==7){
		cout<<"Its sunday today!";
	}
	else{
		cout<<"Please Enter Correct Input!";
	}
}
