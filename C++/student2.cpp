#include<iostream>
#include<string.h>
using namespace std;
class student{
	private: 
	string name;
	int admno;
	float eng, maths, hindi;
	
	public:
	
	void setdata(string name, int admno, float eng, float maths, float hindi){
		this->name,name;
		this->admno=admno;
		this->eng=eng;
		this->maths=maths;
		this->hindi=hindi;
		cout<<"Enter Admission number: ";
		cin>>admno;
		getchar();
		cout<<"Enter Your name: ";
		getline(cin,name);
		
		cout<<"Enter English Marks: ";
		cin>>eng;
		cout<<"Enter Maths Marks: ";
		cin>>maths;
		cout<<"Enter Hindi Marks: ";
		cin>>hindi;
	}
	void getdata(){
   // cout<<"\t----------------------------"<<endl;
	//cout<<"\tAdmission    "<<"\tNAME"<<endl;
	
	cout<<"\t"<<admno<<"\t\t"<<name<<endl;
	//cout<<"\t----------------------------\n"<<endl;
	//cout<<"\tSUBJECT"<<"       \tMARKS"<<endl;
	//cout<<"\t............................."<<endl;
	cout<<"\tENGLISH    "<<"\t"<<eng<<endl;
	cout<<"\tMATHAMETICS"<<"\t"<<maths<<endl;
	cout<<"\tHINDI      "<<"\t"<<hindi<<endl;
	}
};
int main(){
int n, i;
    string name;
	int admno;
	float eng, maths, hindi;
	
	student st[n];
	
	cout<<"Enter Value of n: ";
	cin>>n;
	
	for(i=0; i<n; ++i){
		st[i].setdata(name, admno, eng, maths, hindi);
	}
	for(i=0; i<n; ++i){
		st[i].getdata();
	}
}
