#include<stdio.h>
void main(){
	int n;
	printf("Enter the value of array: ");
	scanf("%d",&n);
	float percantage[n];
	int i, size;
	size = sizeof(percantage)/sizeof(percantage[i]);
	for(i=0; i<size; ++i){
		printf("Enter namber: ");
		scanf("%f", &percantage[i]);
		
	}
	for(i=0; i<size; ++i){
		printf("percant %d = %.2f\n",i+1, percantage[i]);
	}
}
