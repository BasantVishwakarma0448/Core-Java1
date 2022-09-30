#include<stdio.h>
int add(int a, int b){
	return a+b;
}
void main(){
	int a, b, average;
	printf("Enter value of a : ");
	scanf("%d",&a);
	printf("Enter value of b : ");
	scanf("%d",&b);
	average = (a+b)/2;
	printf("average = %d", average);
}
