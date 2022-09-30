#include<stdio.h>
void main(){
	int n, sum=0;
	printf("Enter number: ");
	scanf("%d",&n);
	int k=n;
	int r;
	while(k!=0){
		r=k%10;
		int f=fact(r);
		k=k/10;
		sum=sum+f;
	}
	if (sum==n){
		printf("Entered number is a strong");
		
	}
	else{
		printf("number is not strong");
	}
	
}

