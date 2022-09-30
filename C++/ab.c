#include<stdio.h>
int main(){
	int base, exp;
	long double result = 1.0;
	printf("Enter value of a: ");
	scanf("%d",&base);
	printf("Enter value of b: ");
	scanf("%d",&exp);
	while(exp != 0){
		result *= base;
		--exp;
	}
	printf("%.0Lf", result);
	return 0;
}
