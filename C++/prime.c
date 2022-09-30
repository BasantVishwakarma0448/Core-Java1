#include<stdio.h>
void main(){
	int i = 1, n, count=0;
	printf("enter the value to check number : ");
	scanf("%d",&n);
	for (i=1; i<=n; ++i){
		if(n%i==0){
		count++;
		}
		
		
	}
	if (count==2){
		printf("number is prime!");
	}
	else{
		printf("number is not prime!");
	}
}
