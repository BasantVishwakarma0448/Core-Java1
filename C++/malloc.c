#include<stdio.h>
#include<stdlib.h>
void main(){
	int i, n;
	printf("Enter number of blocks: ");
	scanf("%d",&n);
	int *p = (int*)malloc(sizeof(int)*n);
	for(i=0; i<n; ++i){
		printf("Enter Numbers: ");
		scanf("%d", p+i);
	}
	printf("====New Retrieving Numbers====\n");
	for(i=0; i<n; ++i){
		printf("%d\n", *(p+i));
	}
	free;
}
