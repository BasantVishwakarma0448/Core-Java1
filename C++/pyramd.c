#include<stdio.h>
void main(){
	int i, j ,k, l;
	printf("Enter value to make pyramid: ");
	scanf("%d",&l);
	for(i=1; i<=l; ++i){
		for(j=1; j<=(l-i); ++j){
			printf(" ");
		}
		for(k=1; k<=(i*2-1); ++k){
			printf("*");
		}
		printf("\n");
	}
}
