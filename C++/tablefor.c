#include<stdio.h>
void main(){
	int n, i;
	printf("Enter number to make table: ");
	scanf("%d",&n);
	for(i=1; i<=10; ++i){
		printf("%d X %d = %d\n", n, i, i*n);
	}
}
