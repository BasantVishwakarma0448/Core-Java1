#include<stdio.h>
void main(){
	int i = 1;
	do{
		printf("%dx%dx%d = %d\n", i, i, i, i*i*i);
		i = i+1;
	}while(i<=100);
}
