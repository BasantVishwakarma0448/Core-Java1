#include<stdio.h>
void main(){
	int a, b;
	printf("enter value of a ");
	scanf("%d",&a);
	printf("enter value of b ");
	scanf("%d",&b);
	
	if(a==b){
		printf("a is equal to b");
	}
	else if(a<0){
		printf("please enter the value of a above 0");
	}
		
	else if(b<0){
		printf("please enter the value of b above 0");
	}

 else{
 	printf("a is less than b");
 }
}
