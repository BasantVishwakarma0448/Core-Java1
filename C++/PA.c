#include<stdio.h>
float simpleinterest(PA, T, R){
	return (PA*T*R)/100;
}
void main(){
	int PA, outstanding;
	float T, R;
	printf("Enter amount PA : ");
	scanf("%d",&PA);
	printf("Enter value of T : ");
	scanf("%f",&T);
	printf("Enter value of R : ");
	scanf("%f",&R);
	outstanding = PA + simpleinterest;
	printf("outstanding = %d", outstanding);
}
