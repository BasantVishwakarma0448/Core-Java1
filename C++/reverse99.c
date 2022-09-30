#include<stdio.h>
void main(){
	int i, n;
	printf("Enter value for reverse count: ");
	scanf("%d", &n);
	for(i=n; i>=1; --i){
		printf("%d\n", i);
	}
}
