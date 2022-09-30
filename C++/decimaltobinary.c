#include<stdio.h>
void main(){
	int i, a[10], n;
	printf("Enter value of n : ");
	scanf("%d",&n);
	while(n>0){
		a[i]=n%2;
		
		n=n/2;
		++i;
	}
	for(i=i-1; i>=0; --i)
	printf("%d",a[i]);
}
