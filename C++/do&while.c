#include<stdio.h>
void main(){
	int i = 1, n;
	printf("enter number to make table : ");
	scanf("%d",&n);
	do{
		printf("%d\n",i*n);
		i = i+1;
	}while(i<=10);
}

