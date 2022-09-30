#include<stdio.h>
void main(){
	int n, r, sum;
	printf("enter value for reverse : ");
	scanf(" %d",&n);
	for (r=n%10; n>0; n/10){
		sum = sum*10+r;
		
	}
}
