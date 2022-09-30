#include<stdio.h>
void main(){
	float a, b, c, d;
	printf("enter value of a ");
	scanf("%f",&a);
	printf("enter value of b ");
	scanf("%f",&b);
	printf("enter value of c ");
	scanf("%f",&c);
	printf("enter value of d ");
	scanf("%f",&d);
	
	float sum = a+b, sub = c-b, multi = b*d, div = d/a;
	double per = a%b;
	printf("sum=%f\nsub=%f\nmulti=%f\ndiv=%.2f\nper=%lf\n", sum, sub, multi, div, per);
}
