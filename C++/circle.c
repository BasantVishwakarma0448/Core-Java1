#include<stdio.h>
void main(){
float r, pie=3.14, area;
	printf("enter value of radius : ");
	scanf("%f", &r);
	area = pie*r*r;
	printf("Area of circle is : %.2f", area);
}
