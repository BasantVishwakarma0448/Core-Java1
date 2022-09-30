#include<stdio.h>
void main(){
	int n, r, sum;
	printf("Enter value to reverse : ");
	scanf("%d",&n);
	while (n>0){
		r = n%10;
		sum = sum*10+r;
		n = n/10;
	}
	printf("reverse=%d",sum);
}
