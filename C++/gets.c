#include<stdio.h>
void main(){
	char name[25], address[40];
	printf("Enter your name : ");
	gets(name);
	printf("Enter your address : ");
	gets(address);
	int age;
	printf("Enter your age : ");
	scanf("%d",&age);
	printf(" %s\n",name);
	printf("%s\n",address);
	printf("%d",age);
	
}
