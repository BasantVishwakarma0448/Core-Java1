#include<stdio.h>
float simpleinterest(int pa, int t, float r){
	
	return (pa*t*r)/100;
}
void main(){
	int pa, t;
	float r, ots;
	printf("enter value of pa : ");
	scanf("%d", &pa);
	printf("enter value of t : ");
	scanf("%d", &t);
	printf("enter value of r : ");
	scanf("%f", &r);
float ots = pa+simpleinterest;
	printf("ots = %f",ots/(t*12));
}
