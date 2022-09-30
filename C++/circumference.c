#include<stdio.h>
void main(){
	float r, pie=3.14, circumference;
	printf("enter value of r : ");
	scanf("%f", &r);
	circumference = 2*pie*r;
	printf("cicumference of circle : %.3f", circumference);
}
