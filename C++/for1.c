#include<stdio.h>
void main(){
	int i=1, n;
	printf("value of n : ");
	scanf("%d",&n);
	for (n; i<=10; ++i){
		printf("%d\n", i*n);
	}
}
