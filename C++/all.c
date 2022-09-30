#include<stdio.h>
void main(){
	int a, b;
	printf("enter value of a");
	scanf("%d",&a);
	printf("enter value of b");
	scanf("%d",&b);
	
	int sum = a+b, sub = a-b, multi = a*b;
float	div = a/b, per = a%b;
	
	printf("sum=%d\nsub=%d\nmulti=%d\ndiv=%f\nper=%f\n", sum, sub, multi, div, per);
}
