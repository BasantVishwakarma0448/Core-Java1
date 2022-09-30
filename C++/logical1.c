#include<stdio.h>
void add(){
	int a, b;
	printf("Enter value of a : ");
	scanf("%d",&a);
	printf("Enter value of b : ");
	scanf("%d",&b);
	printf("a+b = %d",a+b);
}
void sub(){
	int a,b;
	printf("Enter value of a : ");
	scanf("%d",&a);
	printf("Enter value of b : ");
	scanf("%d",&b);
	printf("a-b = %d",a-b);
}
void main(){
	int n;
	
	printf("1.add\n");
	printf("2.sub\n");
	scanf("%d",&n);5
	if(n==1){
		add();
	}
	else if (n==2){
		sub();
	}
	else{
		printf("Enter valid value!");
	}
}
