#include<stdio.h>
void main(){
	float base, perpendicular, Area;
	printf("Enter base of triangle : ");
	scanf("%f", &base);
	printf("Enter perpendicular of triangle : ");
	scanf("%f", &perpendicular);
	Area = (base*perpendicular)/2;
	printf("Area of triangle : %.2f", Area);
}
