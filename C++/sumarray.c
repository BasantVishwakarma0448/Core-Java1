#include<stdio.h>
void main(){
	int i, size, sum=0, arr[size];
	printf("Enter array value : ");
	scanf("%d",&size);
	for(i=0; i<size; i++){
		printf("Enter number: ");
		scanf("%d",&arr[i]);
	}
	for(i=0; i<size; i++){
		sum = sum+arr[i];
		printf("%d", sum);
		
	}
	printf("sum of all number %d\n", sum);
}
